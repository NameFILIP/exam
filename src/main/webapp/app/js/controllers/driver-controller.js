'use strict';

/* Controllers */

angular.module('myApp.driver', [])
  .controller('DriverCtrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
     $http.get('/exam/driver').success(function(data) {
    	 $scope.drivers = data;
    });
     $scope.deleteDriver = function(driverId) {
    	 $http['delete']('/exam/driver/' + driverId).success($location.path('/driver'));
     };
  }])
  .controller('DriverNewCtrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
	$scope.driverForm = {};

	$http.get('/exam/car').success(function(data) {
   	 $scope.cars = data;
	});
	
    $scope.submitDriverForm = function(item, event) {
      console.log("--> Submitting the driverForm");
      
      function postDriver(car) {
    	  var driverObject = {
    	           id : $scope.driverForm.id,
    	           fullName  : $scope.driverForm.fullName,
    	           birthDate : $scope.driverForm.birthDate,
    	           experience : $scope.driverForm.experience,
    	           autobiography : $scope.driverForm.autobiography,
    	           salary : $scope.driverForm.salary,
    	           car : car
    	        };
    	   $http.post("/exam/driver", driverObject)
            .success(function(dataFromServer, status, headers, config) {
              $location.path('/driver');
            })
            .error(function(data, status, headers, config) {
              alert("Submitting form failed!");
            });
      }
      
      if ($scope.driverForm.car.number) {
    	  console.log("Trying to get a car with id: " + $scope.driverForm.car.number);
    	  $http.get('/exam/car/' + $scope.driverForm.car.number)
    	  .success(function(carData) {
    		  console.log("Successfully got: " + carData);
    		  postDriver(carData);
     	   }).error (function(data) {
     		   alert("Submitting form failed!");
     	   });
      } else {
    	  console.log("Not trying to get a car with id: " + $scope.driverForm.car.number);
    	  postDriver(null);
      }
      
    };
  }])
  .controller('DriverEditCtrl', ['$scope', '$http', '$routeParams', '$location', function($scope, $http, $routeParams, $location) {
	$scope.driverForm = {};

	$http.get('/exam/car').success(function(data) {
	   	 $scope.cars = data;
	});
	
	$http.get('/exam/driver/' + $routeParams.driverId).success(function(data) {
   	 $scope.driverForm = data;
    });
	
	
    $scope.submitDriverForm = function(item, event) {
      console.log("--> Submitting the driverForm");
      
      function putDriver(car) {
    	  var driverObject = {
  		        id : $scope.driverForm.id,
  		    	fullName  : $scope.driverForm.fullName,
  		    	birthDate : $scope.driverForm.birthDate,
  		    	experience : $scope.driverForm.experience,
  		    	autobiography : $scope.driverForm.autobiography,
  		    	salary : $scope.driverForm.salary,
  		    	car : car
  		      };
  	
  		      $http.put("/exam/driver/" + driverObject.id, driverObject)
  		      	.success(function(dataFromServer, status, headers, config) {
  		              $location.path('/driver');
  	            })
  		      	.error(function(data, status, headers, config) {
  		      		alert("Submitting form failed!");
  		      	});
      }
      
      if ($scope.driverForm.car.number) {
    	  $http.get('/exam/car/' + $scope.driverForm.car.number)
    	  .success(function(carData) {
    		  putDriver(carData);
    	  })
    	  .error (function(data) {
    		  alert("Submitting form failed!");
    	  });
      } else {
    	  putDriver(null);
      }
    };
  }]);
