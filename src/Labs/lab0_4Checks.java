package Labs;

import blackboard.platform.context.Context;

//import blackboard.platform.context.Context;

public class lab0_4Checks extends inputChecks
{
    public lab0_4Checks(int x, int y, String labname)
    {
        super(x,y, labname);
    }
    
    public lab0_4Checks(int x, int y, String labname, Context ctx)
    {
        super(x,y, labname, ctx);
    }
    
    
    @Override
    protected void buildKey()
    {
        setKey(0,0,"clear");
        setKey(0,1,"light");
        setKey(0,2,"ionic");
        
        setKey(1,0,"clear");
        setKey(1,1,"no light");
        setKey(1,2,"covalent");
        
        setKey(2,0,"blue");
        setKey(2,1,"light");
        setKey(2,2,"ionic");
        
        setKey(3,0,"blue");
        setKey(3,1,"dim light");
        setKey(3,2,"ionic");
    }
}
