import com.braisedpanda.base.common.constant.BizStatusConstant;
import com.braisedpanda.base.common.constant.HttpStatusConstant;
import com.braisedpanda.base.common.exception.BizException;
import com.braisedpanda.base.common.model.ResponseStatus;
import org.junit.jupiter.api.Test;

/**
 * @program: project-frame-test
 * @description:
 * @author: chenzhen
 * @create: 2020-01-19 10:21
 **/
public class TestConstant {



    @Test
    public void testConstant(){
        System.out.println(HttpStatusConstant.BAD_REQUEST.getCode());
        System.out.println(ResponseStatus.fail().getMessage());
        System.out.println(ResponseStatus.fail("QINGQIUSHIBAILE").getMessage());
    }

    @Test
    public void testException(){
        int i = 1;
        if(i == 1){
            throw  new BizException(BizStatusConstant.FAILD);
        }

    }
}
