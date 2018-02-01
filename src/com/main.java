package com;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) throws RemoteException {
        com.WorkflowServiceHttpBindingStub binding = null;
        try {
            binding = (com.WorkflowServiceHttpBindingStub)
                    new com.WorkflowServiceLocator().getWorkflowServiceHttpPort();
        } catch (ServiceException e) {
            e.printStackTrace();
        }


       int cout= binding.getCreateWorkflowCount(1,9,new ArrayOfString());
        WorkflowRequestInfo workflowRequestInfo=new WorkflowRequestInfo();
        WorkflowBaseInfo workflowBaseInfo=new WorkflowBaseInfo();
        workflowBaseInfo.setWorkflowId(81+"");
        WorkflowMainTableInfo workflowMain =new WorkflowMainTableInfo();
        ArrayOfWorkflowRequestTableRecord arrayOfWorkflowRequestTableRecord=new ArrayOfWorkflowRequestTableRecord();

       List<WorkflowRequestTableRecord> workflowRequestTableRecord=new ArrayList<WorkflowRequestTableRecord>();

       workflowRequestTableRecord.add(new WorkflowRequestTableRecord());
        arrayOfWorkflowRequestTableRecord.setWorkflowRequestTableRecord(workflowRequestTableRecord.toArray(new WorkflowRequestTableRecord[0]));
        workflowMain.setRequestRecords(arrayOfWorkflowRequestTableRecord);
        workflowRequestInfo.setWorkflowMainTableInfo(workflowMain);
        workflowRequestInfo.setWorkflowBaseInfo(workflowBaseInfo);
        workflowRequestInfo.setCreatorId(1+"");
        workflowRequestInfo.setRequestName("wwwwwwwwwwinit test");
       String s= binding.doCreateWorkflowRequest(workflowRequestInfo,1);
        System.out.println("count:"+s);
    }

}