(function (angular) {
    "use strict";
    var app= angular.module('charts', ['ngRoute', 'ngMessages', 'chart.js', 'ngAnimate', 'ngSanitize', 'ui.bootstrap']);

    app.config(['ChartJsProvider', function(ChartJsProvider){
        ChartJsProvider.setOptions({ colors : [ '#803690', '#00ADF9', '#DCDCDC', '#46BFBD', '#FDB45C', '#949FB1', '#4D5360'] });
    }]);

    app.controller('chartsController', ['$scope', function($scope) {
        $scope.labels = ['2006', '2007', '2008', '2009', '2010', '2011', '2012'];
        $scope.series = ['Series A', 'Series B', 'Series C'];

          $scope.data = [
            [65, 59, 80, 81, 56, 55, 40],
            [28, 48, 40, 19, 86, 27, 190],
            [78, 58, 80, 19, 26, 27, 10]
          ];
    }])

})(angular);