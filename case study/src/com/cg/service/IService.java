package com.cg.service;

package com.cg.service;

import com.cg.entities.*;

public interface IService {
	// defining method
	public Bank searchBankByIFSC(long ifsc);

	public abstract void addBankAccount(Bank bank);

	public abstract void addmoney(Bank bank);

	public abstract void withdrawMoney(Bank bank);
}
