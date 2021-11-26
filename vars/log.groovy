def call(script){
    node(){
    echo 'hello world'
      echo "this value is given by :${script}"
       println script.getClass().getSimpleName()
        println this
        
    }
}
