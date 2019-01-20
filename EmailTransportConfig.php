<?php
    'EmailTransport' => [
        'default' => [
            'className' => 'Mail',
            // The following keys are used in SMTP transports
            'host' => 'localhost',
            'port' => 25,
            'timeout' => 30,
            'username' => 'root',
            'password' => 'vlad2312',
            'client' => null,
            'tls' => null,
            'url' => env('EMAIL_TRANSPORT_DEFAULT_URL', null),
        ],
        'gmail' => [
            'host' => 'ssl://smtp.gmail.com',
            'port' => 465,
            'username' => 'cevchris23@gmail.com',
            'password' => 'etnnvbgfomvegvha',
            'className' => 'Smtp'
        ]
    ],
	
	==================== Route ====
	Router::defaultRouteClass(DashedRoute::class);

   Router::scope('/', function (RouteBuilder $routes) {
      $routes->connect('locale',['controller'=>'Localizations','action'=>'index']);
      $routes->connect('/email',['controller'=>'Emails','action'=>'index']);
      $routes->fallbacks('DashedRoute');
   });
   
   ================ Controller email =========
   <?php
   namespace App\Controller;
   use App\Controller\AppController;
   use Cake\Mailer\Email;

   class EmailsController extends AppController{
      public function index(){
         $email = new Email('default');
         $email->to('cevchris23@outlook.com')->subject('Essai de CakePHP Mailer')->send('Vous pourriez construire un lien de confirmation ici');
      }
   }
?>