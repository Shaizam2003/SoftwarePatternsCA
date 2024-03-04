

	import javax.swing.JDialog;
	import java.util.Vector;

	// Abstract factory interface for dialog creation
	public interface DialogInterface {
		
	    JDialog createEmployeeSummaryDialog(EmployeeDetails parent, Vector<Object> allEmployees);
	    JDialog createSearchByIdDialog(EmployeeDetails parent);
	    JDialog createSearchBySurnameDialog(EmployeeDetails parent);
	    JDialog createAddRecordDialog(EmployeeDetails parent, ClearfieldsInterface clearFields, ManagerRecord Managerrecord);
	}

	// Concrete factory implementing the DialogFactory interface
	class ConcreteDialogFactory implements DialogInterface {
	    @Override
	    public JDialog createEmployeeSummaryDialog(EmployeeDetails parent, Vector<Object> allEmployees) {
	        return new EmployeeSummaryDialog(parent, allEmployees);
	    }

	    @Override
	    public JDialog createSearchByIdDialog(EmployeeDetails parent) {
	        return new SearchByIdDialog(parent);
	    }

	    @Override
	    public JDialog createSearchBySurnameDialog(EmployeeDetails parent) {
	        return new SearchBySurnameDialog(parent);
	    }

	    @Override
	    public JDialog createAddRecordDialog(EmployeeDetails parent, ClearfieldsInterface clearFields, ManagerRecord Managerrecord) {
	        return new AddRecordDialog(parent, clearFields, Managerrecord);
	    }
	}

