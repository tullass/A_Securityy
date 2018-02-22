angular.module('JWTDemoApp').config(
		function($stateProvider, $urlRouterProvider) {

			// the ui router will redirect if a invalid state has come.
			$urlRouterProvider.otherwise('/page-not-found');
			// parent view - navigation state
			$stateProvider.state('nav', {
				abstract : true,
				url : '',
				views : {
					'nav@' : {
						templateUrl : 'app/views/nav.html',
						controller : 'NavController'
					}
				}
			}).state('login', {
				url : '/login',
				views : {
					'content@' : {
						templateUrl : 'app/views/login.html',
						controller : 'LoginController'
					}
				}
			}).state('index10', {
				url : '/contrato',
				views : {
					'content@' : {
						templateUrl : 'app/views/index10.html',
						controller : 'contratoController'
					}
				}
			}).state('users', {
				url : '/users',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/views/users.html',
						controller : 'UsersController',
					}
				}
			}).state('index5', {
				parent : 'nav',
				url : '/departamento',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index5.html',
						controller : 'departamentoController',
					}
				}
			}).state('index6', {
				parent : 'nav',
				url : '/posiccao',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index6.html',
						controller : 'posiccaoController',
					}
				}
			}).state('index7', {
				parent : 'nav',
				url : '/programa',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index7.html',
						controller : 'programaController',
					}
				}
			}).state('home', {
				url : '/',
				views : {
					'content@' : {
						templateUrl : 'app/views/home.html',
						controller : 'HomeController'
					}
				}
			}).state('page-not-found', {
				parent : 'nav',
				url : '/page-not-found',
				views : {
					'content@' : {
						templateUrl : 'app/views/page-not-found.html',
						controller : 'PageNotFoundController'
					}
				}
			}).state('access-denied', {
				parent : 'nav',
				url : '/access-denied',
				views : {
					'content@' : {
						templateUrl : 'app/views/access-denied.html',
						controller : 'AccessDeniedController'
					}
				}
			}).state('index4', {
				parent : 'nav',
				url : '/educacao',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index4.html',
						controller : 'educacaoController'
					}
				}
			}).state('index8', {
				parent : 'nav',
				url : '/supervisor',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index8.html',
						controller : 'supervisorController'
					}
				}
			}).state('index9', {
				parent : 'nav',
				url : '/gestor',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index9.html',
						controller : 'gestorController'
					}
				}
			}).state('index2', {
				parent : 'nav',
				url : '/areaa',
				data : {
					role : 'ADMIN'
				},
				views : {
					'content@' : {
						templateUrl : 'app/pages/index2.html',
						controller : 'areaaController'
					}
				}
			}).state('register', {
				parent : 'nav',
				url : '/register',
				views : {
					'content@' : {
						templateUrl : 'app/views/register.html',
						controller : 'RegisterController'
					}
				}
			});
		});
