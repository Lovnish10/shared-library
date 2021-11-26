public class AddSidebarLinkAction implements hudson.model.Action,java.io.Serializable {
   private String displayName;
   private String iconFileName;
   private String urlName;
   private String iconClassName;
   def script;
  
  public AddSidebarLinkAction(script) {
     this.displayName = displayName;
    this.iconFileName = iconFileName;
    this.urlName = urlName;
    this.iconClassName = iconClassName;
    this.script = script
    
  }
  
   @Override 
   public String getDisplayName() {
    return displayName;
  }
     @Override 
   public String getIconFileName() {
    return iconFileName;
   }
  
   @Override 
   public String getUrlName() {
     return urlName;
   }
  
   public String getIconClassName() {
     return iconClassName;
   }

}
