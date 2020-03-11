package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
// 테스트를 위해 주석 추가