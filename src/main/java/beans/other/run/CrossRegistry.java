package beans.other.run;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This class is used to register the instance to be built by this tool
 * This class is used to store/get data from Database (hibernate)
 */
@Entity
@Table(name = "cross", schema = "run")
public class CrossRegistry extends Registry{
    public CrossRegistry(String name, String commitId) {
        super(name, commitId);
    }
    public CrossRegistry(){
        super();
    }

    @Override
    public boolean isCross() {
        return true;
    }
}
