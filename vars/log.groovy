def call(script){
    node(){
    echo 'hello world'
      echo "this value is given by :${script}"
       println script.getClass().getSimpleName()
        println script
        println this.BRANCH_NAME
        println script.BRANCH_NAME
        println BRANCH_NAME
        
    }
}
