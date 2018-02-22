angular.module("JWTDemoApp").controller("contratoController",
		function($scope, $filter,$http) {
			var urlb = 'http://localhost:8080/contrato';

			$scope.create = function() {
				var metodo = 'POST';
				if ($scope.contrato.id) {
					metodo = 'PUT';
				}
				$http({
					method : metodo,
					url : urlb + '/',
					data : $scope.contrato
				}).then(function successCallback(response) {
					alert("Sucesso");
				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};

			$scope.areaalista = function() {
				$http({
					method : 'GET',
					url : urlb + '/listar',
				}).then(function successCallback(response) {
					$scope.areaa = response.data;
				}, function errorCallback(response) {
				});
			};$scope.areaalista();
			$scope.data = [ {
				"careerStartedOn" : "2018-10-03T13:44:00.587",
				"nome" : "xxx"
			}, {
				"careerStartedOn" : "2019-10-03T13:44:00.587",
				"nome" : ""
			}, {
				"careerStartedOn" : "2020-10-03T13:44:00.587",
				"nome" : ""
			} ];
	 dd =function(){
	var d=document.getElementById('d').getAttribute;
	alert(d);
	console.log(d);
	}
			$scope.CalDate = function(date1, date2) {
				var diff = Math.floor(date1.getTime() - date2.getTime());
				var d = new Date().getFullYear();

				var secs = Math.floor(diff / 1000);
				var mins = Math.floor(secs / 60);
				var hours = Math.floor(mins / 60);
				var days = Math.floor(hours / 24) + 4;
				var months = Math.floor(days / 31);
				var years = Math.floor(months / 12);
				months = Math.floor(months % 12);
				days = Math.floor(days % 31);
				hours = Math.floor(hours % 24);
				mins = Math.floor(mins % 60);
				secs = Math.floor(secs % 60);
				var message = "";
				if (days <= 0) {
					message += secs + " sec ";
					message += mins + " min ";
					message += hours + " hours ";

				} else {
					if (years < 1) {
					}else{
						return "Calculando";
					}
					if (months > 0 || years > 0) {
						message += months + " meses ";
					}
					message += days + " dias";
				}
				return message
			};

			$scope.getExp = function(date) {
				date = new Date($filter('date')(date, "yyyy/MM/dd"));
				var currdate = new Date($filter('date')(new Date(), "yyyy/MM/dd"));
				new Date().getFullYear()
				var exp = $scope.CalDate(date, currdate);

				return exp;
			}
	
		});