import AddSidebarLinkAction
def call(script){
    node(){
    echo 'hello world'
      echo "this value is given by :${script}"
       println script.getClass().getSimpleName()
        println script
       // println this.BRANCH_NAME
        println script.env.JENKINS_URL
        println env.JENKINS_URL
        
    }
}
