package bank42;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;
	MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	/**
	 * CREATE
	 * */
	@Override
	public void join(String id, String name, String ssn, String pass) {
		MemberBean memberBean = new MemberBean();
		memberBean.setId(id);
		memberBean.setName(name);
		memberBean.setSsn(ssn);
		memberBean.setPass(pass);
		members[count] = memberBean;
		count++;

	}
	/**
	 * READ
	 * */
	@Override
	public MemberBean[] findAll() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean memberBean = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)) {
				memberBean = members[i];
			}
		}
		return memberBean;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id) &&
					members[i].getPass().equals(pass)) {
				ok = true;
				break;
			} 
		}

		return ok;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return count;
	}
	
	/**
	 * 수정 update
	 * */
	@Override
	public void updatePassword(String id, String pass, String newpass) {
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id) &&	members[i].getPass().equals(pass)) {
				members[i].setPass(newpass);
				break;
			}
		}
	}
	/**
	 * 삭제 delete
	 * */
	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub

	}





}
