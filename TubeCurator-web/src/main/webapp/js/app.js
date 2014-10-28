(function() {
	var app = angular.module('tubeCurator', ['ngSanitize']);
	
	app.controller('TubeController', ['$scope', '$http','$sce', function($scope, $http, $sce) {
		var ctrl = this;
		this.tubeEntries = [];
		$http.get('/tubecurator/rest/tube/all').success(function(data) {
			ctrl.tubeEntries = data; 
		}).error(function(data) {
			alert(data);
		});

		$scope.trustSrc = function(src){
			return $sce.trustAsResourceUrl(src);
		};
		
	}]);
	
})();
