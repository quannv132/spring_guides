# Some important annotation you must remeber in this guide:
## 1. @RestController
      -Classes are identified as controller class when use this annotation to handle GET, POST, ... requests 
      a path by return a instance of the module class.
## 2. @RequestMapping
      -This annotation ensures that HTTPS request to a init path are mapped to a method in a module class.
      -Besides, this annotation map all HTTPS requests without does not specify GET, POST, PUT...
      -You can use [@RequestMapping(method="GET")] to narrow this mapping 
      
