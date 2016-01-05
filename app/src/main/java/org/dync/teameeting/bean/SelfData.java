package org.dync.teameeting.bean;

/**
 * Created by 小白龙 on 2015/12/28 0028.
 */
public class SelfData
{


    /**
     * authorization : 6d10ffe96955d5f5a9afdd9934c2d969f59705625dfb98d002807c43015d6b8d
     * code : 200
     * information : {"uactype":2,"ulogindev":2,"uname":"12210836","upushtoken":"TeamMeeting","uregtime":1449470013699,"uregtype":0,"userid":"cc1f0115b54c46a1","ustatus":1}
     * message : user init success
     * requestid : 1451283887167
     */

    private String authorization;
    private int code;
    /**
     * uactype : 2
     * ulogindev : 2
     * uname : 12210836
     * upushtoken : TeamMeeting
     * uregtime : 1449470013699
     * uregtype : 0
     * userid : cc1f0115b54c46a1
     * ustatus : 1
     */

    private InformationEntity information;
    private String message;
    private long requestid;

    public void setAuthorization(String authorization)
    {
        this.authorization = authorization;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public void setInformation(InformationEntity information)
    {
        this.information = information;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setRequestid(long requestid)
    {
        this.requestid = requestid;
    }

    public String getAuthorization()
    {
        return authorization;
    }

    public int getCode()
    {
        return code;
    }

    public InformationEntity getInformation()
    {
        return information;
    }

    public String getMessage()
    {
        return message;
    }

    public long getRequestid()
    {
        return requestid;
    }

    public static class InformationEntity
    {
        private int uactype;
        private int ulogindev;
        private String uname;
        private String upushtoken;
        private long uregtime;
        private int uregtype;
        private String userid;
        private int ustatus;

        public void setUactype(int uactype)
        {
            this.uactype = uactype;
        }

        public void setUlogindev(int ulogindev)
        {
            this.ulogindev = ulogindev;
        }

        public void setUname(String uname)
        {
            this.uname = uname;
        }

        public void setUpushtoken(String upushtoken)
        {
            this.upushtoken = upushtoken;
        }

        public void setUregtime(long uregtime)
        {
            this.uregtime = uregtime;
        }

        public void setUregtype(int uregtype)
        {
            this.uregtype = uregtype;
        }

        public void setUserid(String userid)
        {
            this.userid = userid;
        }

        public void setUstatus(int ustatus)
        {
            this.ustatus = ustatus;
        }

        public int getUactype()
        {
            return uactype;
        }

        public int getUlogindev()
        {
            return ulogindev;
        }

        public String getUname()
        {
            return uname;
        }

        public String getUpushtoken()
        {
            return upushtoken;
        }

        public long getUregtime()
        {
            return uregtime;
        }

        public int getUregtype()
        {
            return uregtype;
        }

        public String getUserid()
        {
            return userid;
        }

        public int getUstatus()
        {
            return ustatus;
        }

        @Override
        public String toString()
        {
            return "InformationEntity{" +
                    "uactype=" + uactype +
                    ", ulogindev=" + ulogindev +
                    ", uname='" + uname + '\'' +
                    ", upushtoken='" + upushtoken + '\'' +
                    ", uregtime=" + uregtime +
                    ", uregtype=" + uregtype +
                    ", userid='" + userid + '\'' +
                    ", ustatus=" + ustatus +
                    '}';
        }
    }
}
