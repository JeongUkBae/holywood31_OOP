package bank21;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;
	MemberServiceImpl(){
		members = new MemberBean[10];
		count=0;
	}
//"C"-----------------------------------------------------------
	@Override
	public void join(String id, String name, 
			String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setSsn(ssn);
		member.setPass(pass);
		members[count] = member;
		count++;
		}
//"R"-----------------------------------------------------------	
	@Override
	public MemberBean[] list() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean memberBean = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)) {
				memberBean = members[i];
				break;
			}
		}
		
		return memberBean;
	}

	@Override
	public boolean login(String id, String pass) {
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
	public int count() {
		return (count);
	}

//"U,D"----------------------------------------------------------
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


	

}
