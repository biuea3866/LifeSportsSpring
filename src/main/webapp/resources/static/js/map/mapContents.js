// Kakao Map
var container = document.getElementById("mapContainer");
var options = {
    center: new kakao.maps.LatLng(33.450701, 126.570667),
    level: 3
};
var map = new kakao.maps.Map(container, options);
var zoomControl = new kakao.maps.ZoomControl();

map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);

var mapList = [];

function marker(mapContainer, mapData) {
    var marker = new kakao.maps.Marker({
        map: mapContainer,
        position: new kakao.maps.LatLng(Number(mapData.FACI_POINT_Y), Number(mapData.FACI_POINT_X)),
        image: new kakao.maps.MarkerImage(
            '../../img/img_category/markerImage.png',
            new kakao.maps.Size(35, 35),
        ),
    });

    if(mapData.FACI_NM) {
        mapData.FACI_NM = map.FACI_NM.replace(/"/gi, "");
    }

    var content =
        '<div class="wrap">' +
        '   <div class="header">' +
        '       <div id="close" class="header_header">' +
        `            <img src='../../img/close.svg' style="width: 30px; height: 30px;">` +
        '       </div>' +
        '       <div class="header_contents">' +
        `           <h2><b>${mapData.FACI_NM}</b></h2>` +
        '       </div>' +
        '       <div class="header_contents">' +
        `           ${mapData.ADDR_CP_NM} ${' '} ${mapData.ADDR_CPB_NM} ${' '} ${mapData.ADDR_EMD_NM}` +
        '       </div>' +
        '       <div class="header_contents">' +
        `           ${mapData.FACI_ROAD_ADDR1}` +
        '       </div>' +
        '   </div>' +
        '   <div class="contents">' +
        '       <div class="contents_header">' +
        '           <b>이용안내</b>' +
        '       </div>' +
        '       <div class="contents_contents">' +
        '           이용요금: 30000원 / 시간' +
        '       </div>' +
        '       <div class="contents_contents">' +
        '           이용요일: 월 ~ 일' +
        '       </div>' +
        '       <div class="contents_header">' +
        '           <b>연락처</b>' +
        '       </div>' +
        '       <div class="contents_contents">' +
        `           전화번호: ${mapData.FMNG_USER_TEL}` +
        '       </div>' +
        '       <div class="contents_contents">' +
        `           홈페이지: ${mapData.FACI_HOMEPAGE}` +
        '       </div>' +
        '   </div>' +
        '   <div class="article">' +
        '       <div class="article_header">' +
        '           <b>대관 날짜 선택</b>' +
        '       </div>' +
        '       <div class="article_contents">' +
        '           시작 날짜: <input type="date" id="startDate"/>' +
        '       </div>' +
        '       <div class="article_contents">' +
        '           종료 날짜: <input type="date" id="finishDate" min="2020-12-10"/>' +
        '       </div>' +
        '       <div class="article_contents">' +
        '           시작 시간: <input type="number" id="startTime" min="9" placeholder="9시부터 입력가능"/>' +
        '       </div>' +
        '       <div class="article_contents">' +
        '           종료 시간: <input type="number" id="finishTime" min="22" placeholder="22시까지 입력가능"/>' +
        '       </div>' +
        '   </div>' +
        '   <div class="footer">' +
        '       <div id="submit">' +
        '           <b>대관하기</b>' +
        '       </div>' +
        '   </div>' +
        '</div>';
    var overlay = new kakao.maps.CustomOverlay({
        content: content,
        position: marker.getPosition()
    });

    kakao.maps.event.addListener(marker, 'click', function(){
        overlay = new kakao.maps.CustomOverlay({
            content: content,
            map: mapContainer,
            position: marker.getPosition()
        });

        document.getElementById('close').addEventListener("click", closeInfo);
        document.getElementById('submit').addEventListener("click", goRental);
    });

    function closeInfo() {
        overlay.setMap(null);
    }

    function goRental() {
        var startDate = document.getElementById('startDate').value;
        var finishDate = document.getElementById('finishDate').value;
        var startTime = document.getElementById('startTime').value;
        var finishTime = document.getElementById('finishTime').value;
    }
}

// mapContents Function
function searchKeyword() {
    $.ajax({
        url: '/map/getListByKeyword?searching=' + $("#searching").val(),
        type: 'get',
        data: '',
        dataType: 'json',
        success: function(data) {
            mapList = data;
        },
        error: function(XHR, status, e) {
            console.error(status + ":" + e);
        }
    });
}
