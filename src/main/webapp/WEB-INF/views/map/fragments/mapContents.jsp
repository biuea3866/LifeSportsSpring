<%--
  Created by IntelliJ IDEA.
  User: biuea
  Date: 20. 12. 21.
  Time: 오후 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/map/fragments/mapContents.css"/>
<div id="searchBar">
    <div id="searchBar_Header">
        <div id="searchBar_Header_Header">
            오늘은 어디서 <br/>
            운동을 해볼까요?
        </div>
        <div id="searchBar_Header_Contents">
            <div id="searchBar_Header_Contents_Article">
                지금 보고있는 지역은 <button><b>asd</b></button>
            </div>
            <div id="searchBar_Header_Contents_Filter">
                <button>
                    필터
                </button>
            </div>
        </div>
    </div>
    <div id="searchBar_Contents">
        <div id="searchBar_Contents_Header">
            <div id="searchBar_Contents_Header_inputArea">
                <input
                    id="searching"
                    type="text"
                >
            </div>
            <div id="searchBar_Contents_Header_iconArea">
                <input
                    id="search_icon"
                    type="button"
                    value="검색"
                    onclick="searchKeyword()"
                />
            </div>
        </div>
        <div id="searchBar_Contents_Contents"></div>
    </div>
</div>
<div id="mapContainer">

</div>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a7455d2c4f2829b97c83280d4003f3d0"></script>
<script src="${pageContext.request.contextPath}/resources/static/js/map/mapContents.js"></script>