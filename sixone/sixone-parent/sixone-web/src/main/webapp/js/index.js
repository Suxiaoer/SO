requirejs.config({
  baseUrl: './js',
  paths: {
    app: 'app',
    hello:"hello",
    jQuery:"../jquery/jquery"
   },
  
//   shim:{
//	   jQuery:{exports:"jQuery"}
//   }
   
   shim:{
	   hello:{
		   init:function(){
			   return {
				   hello1:hello1,
				   hello2:hello2
			   }
		   }
	   },
	   
	   jQuery:{exports:"jQuery"}
	   
   }
});

requirejs(['app',"hello","jQuery"], function(app,hello,jQuery) {
  hello.hello1();
  alert($("h1").html());
  $("h1").bind("click",function(){app.hello()});
});