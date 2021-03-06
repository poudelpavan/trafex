import java.util.List;

/**
 * @author Pavan Poudel
 * Date - 2018/08/03
 */
public class Transaction {
    private int tx_id;
    private int rw_set_size;
    private int update_rate;
    private List<Objects> rset;
    private List<Objects> wset;
    private String status;
    private int execution_time;
    private int waited_for;
    private int conflicts;
    private int comm_cost;
    private int waiting_time;
    private int arrived_at;
    private int home_node;

    public int getHome_node() {
        return home_node;
    }

    public void setHome_node(int home_node) {
        this.home_node = home_node;
    }

    public int getArrived_at() {
        return arrived_at;
    }

    public void setArrived_at(int arrived_at) {
        this.arrived_at = arrived_at;
    }

    public int getWaiting_time() {
        return waiting_time;
    }

    public void setWaiting_time(int waiting_time) {
        this.waiting_time = waiting_time;
    }

    public Transaction(int tx_id, int rw_set_size, int update_rate, List<Objects> rset, List<Objects> wset, String status, int execution_time, int waited_for, int conflicts, int comm_cost) {
        this.tx_id = tx_id;
        this.rw_set_size = rw_set_size;
        this.update_rate = update_rate;
        this.rset = rset;
        this.wset = wset;
        this.status = status;
        this.execution_time = execution_time;
        this.waited_for = waited_for;
        this.conflicts = conflicts;
        this.comm_cost = comm_cost;
    }

    public Transaction() {
    }

    public int getComm_cost() {
        return comm_cost;
    }

    public void setComm_cost(int comm_cost) {
        this.comm_cost = comm_cost;
    }

    public int getConflicts() {
        return conflicts;
    }

    public void setConflicts(int conflicts) {
        this.conflicts = conflicts;
    }

    public int getWaited_for() {
        return waited_for;
    }

    public void setWaited_for(int waited_for) {
        this.waited_for = waited_for;
    }

    public int getTx_id() {
        return tx_id;
    }

    public void setTx_id(int tx_id) {
        this.tx_id = tx_id;
    }

    public int getRw_set_size() {
        return rw_set_size;
    }

    public void setRw_set_size(int rw_set_size) {
        this.rw_set_size = rw_set_size;
    }

    public int getUpdate_rate() {
        return update_rate;
    }

    public void setUpdate_rate(int rw_ratio) {
        this.update_rate = rw_ratio;
    }

    public List<Objects> getRset() {
        return rset;
    }

    public void setRset(List<Objects> rset) {
        this.rset = rset;
    }

    public List<Objects> getWset() {
        return wset;
    }

    public void setWset(List<Objects> wset) {
        this.wset = wset;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(int execution_time) {
        this.execution_time = execution_time;
    }
}