// Kakao Map
var container = document.getElementById("mapContainer");
var options = {
    center: new kakao.maps.LatLng(33.450701, 126.570667),
    level: 3
};
var map = new kakao.maps.Map(container, options);
var zoomControl = new kakao.maps.ZoomControl();

map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);

console.log('${mapList}');

// mapContents Function
function searchKeyword() {
    $.ajax({
        url: '/map/getListByKeyword?searching=' + $("#searching").val(),
        type: 'get',
        data: '',
        dataType: 'json',
        success: function(data) {
            console.log(data);
        },
        error: function(XHR, status, e) {
            console.error(status + ":" + e);
        }
    });
}