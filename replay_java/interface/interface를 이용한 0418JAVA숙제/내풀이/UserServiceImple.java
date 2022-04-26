package user;

import java.util.List;

/**
 * @author geunhwan Ryu
 * @Date 2022. 4. 20.
 * comment : UserService의 interface
 */
public interface UserServiceImple {
    
    // Window -> preferences -> java -> Code Stlye -> Code Templates -> Comments
	// 코멘트 달기 사용목적 : 누가 언제 메소드 or 클래스를 만들었는지 추적 하기 위해서
	// 단축키 Alt + Shift + j
	/**
	 * @param list
	 * @param dname
	 * @return List
	 * @date : 2022. 4. 20.
	 * @author : geunhwan Ryu
	 */
	public List<UserVO> updateSal(List<UserVO> list, String dname);
	public List<UserVO> updateLv(List<UserVO> list);
	public List<UserVO> deleteUser(List<UserVO> list, int lv);
	public UserVO selectUserByEname(List<UserVO> list, String ename);
}