package it.unical.inf.asd.jpa.entity.one2many.other;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_settings")
public class AccountSetting {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column(name = "name", nullable = false)
    private String settingName;
 
    @Column(name = "value", nullable = false)
    private String settingValue;

    /* default fetch
        OneToOne: EAGER
        ManyToOne: EAGER
        OneToMany: LAZY
        ManyToMany: LAZY
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="account_id", nullable = false)
    private Account account;

    @Column(name="IMAGE")
    @Lob
    @Basic(fetch=FetchType.LAZY)
    private byte[] image;

    // getters and setters
}