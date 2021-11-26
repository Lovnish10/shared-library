def call(script){
    node(){
    echo 'hello world'
      echo "this value is given by :${script}"
       println script.getClass().getSimpleName()
        println script
       // println this.BRANCH_NAME
        println script.env..BRANCH_NAME
        println env.BRANCH_NAME
        
    }
}
