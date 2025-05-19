package vn.trandoananh.DoAnCK_1.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "giaithuong")
public class Award {
	@Id
    @Column(name = "GT_ID")
    private String id;

    @Column(name = "TENGIAITHUONG")
    private String title;

    @Column(name = "DONVITANG")
    private String organization;

    @Column(name = "NAMTANG")
    private LocalDate awardDate;

    // Getters and Setters

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }

    public LocalDate getAwardDate() { return awardDate; }
    public void setAwardDate(LocalDate awardDate) { this.awardDate = awardDate; }
}
