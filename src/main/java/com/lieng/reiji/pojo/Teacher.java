package com.lieng.reiji.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 教师信息
 * @TableName teacher
 */
@TableName(value ="teacher")
public class Teacher implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 18条1
     */
    private Integer shibatiao1;

    /**
     * 18条2
     */
    private Integer shibatiao2;

    /**
     * 18条3
     */
    private Integer shibatiao3;

    /**
     * Jazz10条1
     */
    private Integer jazz1;

    /**
     * Jazz10条2
     */
    private Integer jazz2;

    /**
     * Jazz10条3
     */
    private Integer jazz3;

    /**
     * Bebe15种1
     */
    private Integer bebeshiwu1;

    /**
     * Bebe15种2
     */
    private Integer bebeshiwu2;

    /**
     * Bebe15种3
     */
    private Integer bebeshiwu3;

    /**
     * Bebe手脚双击1
     */
    private Integer bebeshoujiao1;

    /**
     * Bebe手脚双击2
     */
    private Integer bebeshoujiao2;

    /**
     * Bebe手脚双击3
     */
    private Integer bebeshoujiao3;

    /**
     * Mark声音练习1
     */
    private Integer mark1;

    /**
     * Mark声音练习2
     */
    private Integer mark2;

    /**
     * Mark声音练习3
     */
    private Integer mark3;

    /**
     * 601
     */
    private Integer liushi1;

    /**
     * 602
     */
    private Integer liushi2;

    /**
     * 603
     */
    private Integer liushi3;

    /**
     * GhostNote1
     */
    private Integer ghostnote1;

    /**
     * GhostNote2
     */
    private Integer ghostnote2;

    /**
     * GhostNote3
     */
    private Integer ghostnote3;

    /**
     * 鼓垫4681
     */
    private Integer gudian1;

    /**
     * 鼓垫4682
     */
    private Integer gudian2;

    /**
     * 鼓垫4683
     */
    private Integer gudian3;

    /**
     * 基本功练习1
     */
    private Integer jibengong1;

    /**
     * 基本功练习2
     */
    private Integer jibengong2;

    /**
     * 基本功练习3
     */
    private Integer jibengong3;

    /**
     * poly1
     */
    private Integer poly1;

    /**
     * poly2
     */
    private Integer poly2;

    /**
     * poly3
     */
    private Integer poly3;

    /**
     * 总分
     */
    private Integer score;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 修改人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 修改人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 18条1
     */
    public Integer getShibatiao1() {
        return shibatiao1;
    }

    /**
     * 18条1
     */
    public void setShibatiao1(Integer shibatiao1) {
        this.shibatiao1 = shibatiao1;
    }

    /**
     * 18条2
     */
    public Integer getShibatiao2() {
        return shibatiao2;
    }

    /**
     * 18条2
     */
    public void setShibatiao2(Integer shibatiao2) {
        this.shibatiao2 = shibatiao2;
    }

    /**
     * 18条3
     */
    public Integer getShibatiao3() {
        return shibatiao3;
    }

    /**
     * 18条3
     */
    public void setShibatiao3(Integer shibatiao3) {
        this.shibatiao3 = shibatiao3;
    }

    /**
     * Jazz10条1
     */
    public Integer getJazz1() {
        return jazz1;
    }

    /**
     * Jazz10条1
     */
    public void setJazz1(Integer jazz1) {
        this.jazz1 = jazz1;
    }

    /**
     * Jazz10条2
     */
    public Integer getJazz2() {
        return jazz2;
    }

    /**
     * Jazz10条2
     */
    public void setJazz2(Integer jazz2) {
        this.jazz2 = jazz2;
    }

    /**
     * Jazz10条3
     */
    public Integer getJazz3() {
        return jazz3;
    }

    /**
     * Jazz10条3
     */
    public void setJazz3(Integer jazz3) {
        this.jazz3 = jazz3;
    }

    /**
     * Bebe15种1
     */
    public Integer getBebeshiwu1() {
        return bebeshiwu1;
    }

    /**
     * Bebe15种1
     */
    public void setBebeshiwu1(Integer bebeshiwu1) {
        this.bebeshiwu1 = bebeshiwu1;
    }

    /**
     * Bebe15种2
     */
    public Integer getBebeshiwu2() {
        return bebeshiwu2;
    }

    /**
     * Bebe15种2
     */
    public void setBebeshiwu2(Integer bebeshiwu2) {
        this.bebeshiwu2 = bebeshiwu2;
    }

    /**
     * Bebe15种3
     */
    public Integer getBebeshiwu3() {
        return bebeshiwu3;
    }

    /**
     * Bebe15种3
     */
    public void setBebeshiwu3(Integer bebeshiwu3) {
        this.bebeshiwu3 = bebeshiwu3;
    }

    /**
     * Bebe手脚双击1
     */
    public Integer getBebeshoujiao1() {
        return bebeshoujiao1;
    }

    /**
     * Bebe手脚双击1
     */
    public void setBebeshoujiao1(Integer bebeshoujiao1) {
        this.bebeshoujiao1 = bebeshoujiao1;
    }

    /**
     * Bebe手脚双击2
     */
    public Integer getBebeshoujiao2() {
        return bebeshoujiao2;
    }

    /**
     * Bebe手脚双击2
     */
    public void setBebeshoujiao2(Integer bebeshoujiao2) {
        this.bebeshoujiao2 = bebeshoujiao2;
    }

    /**
     * Bebe手脚双击3
     */
    public Integer getBebeshoujiao3() {
        return bebeshoujiao3;
    }

    /**
     * Bebe手脚双击3
     */
    public void setBebeshoujiao3(Integer bebeshoujiao3) {
        this.bebeshoujiao3 = bebeshoujiao3;
    }

    /**
     * Mark声音练习1
     */
    public Integer getMark1() {
        return mark1;
    }

    /**
     * Mark声音练习1
     */
    public void setMark1(Integer mark1) {
        this.mark1 = mark1;
    }

    /**
     * Mark声音练习2
     */
    public Integer getMark2() {
        return mark2;
    }

    /**
     * Mark声音练习2
     */
    public void setMark2(Integer mark2) {
        this.mark2 = mark2;
    }

    /**
     * Mark声音练习3
     */
    public Integer getMark3() {
        return mark3;
    }

    /**
     * Mark声音练习3
     */
    public void setMark3(Integer mark3) {
        this.mark3 = mark3;
    }

    /**
     * 601
     */
    public Integer getLiushi1() {
        return liushi1;
    }

    /**
     * 601
     */
    public void setLiushi1(Integer liushi1) {
        this.liushi1 = liushi1;
    }

    /**
     * 602
     */
    public Integer getLiushi2() {
        return liushi2;
    }

    /**
     * 602
     */
    public void setLiushi2(Integer liushi2) {
        this.liushi2 = liushi2;
    }

    /**
     * 603
     */
    public Integer getLiushi3() {
        return liushi3;
    }

    /**
     * 603
     */
    public void setLiushi3(Integer liushi3) {
        this.liushi3 = liushi3;
    }

    /**
     * GhostNote1
     */
    public Integer getGhostnote1() {
        return ghostnote1;
    }

    /**
     * GhostNote1
     */
    public void setGhostnote1(Integer ghostnote1) {
        this.ghostnote1 = ghostnote1;
    }

    /**
     * GhostNote2
     */
    public Integer getGhostnote2() {
        return ghostnote2;
    }

    /**
     * GhostNote2
     */
    public void setGhostnote2(Integer ghostnote2) {
        this.ghostnote2 = ghostnote2;
    }

    /**
     * GhostNote3
     */
    public Integer getGhostnote3() {
        return ghostnote3;
    }

    /**
     * GhostNote3
     */
    public void setGhostnote3(Integer ghostnote3) {
        this.ghostnote3 = ghostnote3;
    }

    /**
     * 鼓垫4681
     */
    public Integer getGudian1() {
        return gudian1;
    }

    /**
     * 鼓垫4681
     */
    public void setGudian1(Integer gudian1) {
        this.gudian1 = gudian1;
    }

    /**
     * 鼓垫4682
     */
    public Integer getGudian2() {
        return gudian2;
    }

    /**
     * 鼓垫4682
     */
    public void setGudian2(Integer gudian2) {
        this.gudian2 = gudian2;
    }

    /**
     * 鼓垫4683
     */
    public Integer getGudian3() {
        return gudian3;
    }

    /**
     * 鼓垫4683
     */
    public void setGudian3(Integer gudian3) {
        this.gudian3 = gudian3;
    }

    /**
     * 基本功练习1
     */
    public Integer getJibengong1() {
        return jibengong1;
    }

    /**
     * 基本功练习1
     */
    public void setJibengong1(Integer jibengong1) {
        this.jibengong1 = jibengong1;
    }

    /**
     * 基本功练习2
     */
    public Integer getJibengong2() {
        return jibengong2;
    }

    /**
     * 基本功练习2
     */
    public void setJibengong2(Integer jibengong2) {
        this.jibengong2 = jibengong2;
    }

    /**
     * 基本功练习3
     */
    public Integer getJibengong3() {
        return jibengong3;
    }

    /**
     * 基本功练习3
     */
    public void setJibengong3(Integer jibengong3) {
        this.jibengong3 = jibengong3;
    }

    /**
     * poly1
     */
    public Integer getPoly1() {
        return poly1;
    }

    /**
     * poly1
     */
    public void setPoly1(Integer poly1) {
        this.poly1 = poly1;
    }

    /**
     * poly2
     */
    public Integer getPoly2() {
        return poly2;
    }

    /**
     * poly2
     */
    public void setPoly2(Integer poly2) {
        this.poly2 = poly2;
    }

    /**
     * poly3
     */
    public Integer getPoly3() {
        return poly3;
    }

    /**
     * poly3
     */
    public void setPoly3(Integer poly3) {
        this.poly3 = poly3;
    }

    /**
     * 总分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 总分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Teacher other = (Teacher) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getShibatiao1() == null ? other.getShibatiao1() == null : this.getShibatiao1().equals(other.getShibatiao1()))
            && (this.getShibatiao2() == null ? other.getShibatiao2() == null : this.getShibatiao2().equals(other.getShibatiao2()))
            && (this.getShibatiao3() == null ? other.getShibatiao3() == null : this.getShibatiao3().equals(other.getShibatiao3()))
            && (this.getJazz1() == null ? other.getJazz1() == null : this.getJazz1().equals(other.getJazz1()))
            && (this.getJazz2() == null ? other.getJazz2() == null : this.getJazz2().equals(other.getJazz2()))
            && (this.getJazz3() == null ? other.getJazz3() == null : this.getJazz3().equals(other.getJazz3()))
            && (this.getBebeshiwu1() == null ? other.getBebeshiwu1() == null : this.getBebeshiwu1().equals(other.getBebeshiwu1()))
            && (this.getBebeshiwu2() == null ? other.getBebeshiwu2() == null : this.getBebeshiwu2().equals(other.getBebeshiwu2()))
            && (this.getBebeshiwu3() == null ? other.getBebeshiwu3() == null : this.getBebeshiwu3().equals(other.getBebeshiwu3()))
            && (this.getBebeshoujiao1() == null ? other.getBebeshoujiao1() == null : this.getBebeshoujiao1().equals(other.getBebeshoujiao1()))
            && (this.getBebeshoujiao2() == null ? other.getBebeshoujiao2() == null : this.getBebeshoujiao2().equals(other.getBebeshoujiao2()))
            && (this.getBebeshoujiao3() == null ? other.getBebeshoujiao3() == null : this.getBebeshoujiao3().equals(other.getBebeshoujiao3()))
            && (this.getMark1() == null ? other.getMark1() == null : this.getMark1().equals(other.getMark1()))
            && (this.getMark2() == null ? other.getMark2() == null : this.getMark2().equals(other.getMark2()))
            && (this.getMark3() == null ? other.getMark3() == null : this.getMark3().equals(other.getMark3()))
            && (this.getLiushi1() == null ? other.getLiushi1() == null : this.getLiushi1().equals(other.getLiushi1()))
            && (this.getLiushi2() == null ? other.getLiushi2() == null : this.getLiushi2().equals(other.getLiushi2()))
            && (this.getLiushi3() == null ? other.getLiushi3() == null : this.getLiushi3().equals(other.getLiushi3()))
            && (this.getGhostnote1() == null ? other.getGhostnote1() == null : this.getGhostnote1().equals(other.getGhostnote1()))
            && (this.getGhostnote2() == null ? other.getGhostnote2() == null : this.getGhostnote2().equals(other.getGhostnote2()))
            && (this.getGhostnote3() == null ? other.getGhostnote3() == null : this.getGhostnote3().equals(other.getGhostnote3()))
            && (this.getGudian1() == null ? other.getGudian1() == null : this.getGudian1().equals(other.getGudian1()))
            && (this.getGudian2() == null ? other.getGudian2() == null : this.getGudian2().equals(other.getGudian2()))
            && (this.getGudian3() == null ? other.getGudian3() == null : this.getGudian3().equals(other.getGudian3()))
            && (this.getJibengong1() == null ? other.getJibengong1() == null : this.getJibengong1().equals(other.getJibengong1()))
            && (this.getJibengong2() == null ? other.getJibengong2() == null : this.getJibengong2().equals(other.getJibengong2()))
            && (this.getJibengong3() == null ? other.getJibengong3() == null : this.getJibengong3().equals(other.getJibengong3()))
            && (this.getPoly1() == null ? other.getPoly1() == null : this.getPoly1().equals(other.getPoly1()))
            && (this.getPoly2() == null ? other.getPoly2() == null : this.getPoly2().equals(other.getPoly2()))
            && (this.getPoly3() == null ? other.getPoly3() == null : this.getPoly3().equals(other.getPoly3()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getShibatiao1() == null) ? 0 : getShibatiao1().hashCode());
        result = prime * result + ((getShibatiao2() == null) ? 0 : getShibatiao2().hashCode());
        result = prime * result + ((getShibatiao3() == null) ? 0 : getShibatiao3().hashCode());
        result = prime * result + ((getJazz1() == null) ? 0 : getJazz1().hashCode());
        result = prime * result + ((getJazz2() == null) ? 0 : getJazz2().hashCode());
        result = prime * result + ((getJazz3() == null) ? 0 : getJazz3().hashCode());
        result = prime * result + ((getBebeshiwu1() == null) ? 0 : getBebeshiwu1().hashCode());
        result = prime * result + ((getBebeshiwu2() == null) ? 0 : getBebeshiwu2().hashCode());
        result = prime * result + ((getBebeshiwu3() == null) ? 0 : getBebeshiwu3().hashCode());
        result = prime * result + ((getBebeshoujiao1() == null) ? 0 : getBebeshoujiao1().hashCode());
        result = prime * result + ((getBebeshoujiao2() == null) ? 0 : getBebeshoujiao2().hashCode());
        result = prime * result + ((getBebeshoujiao3() == null) ? 0 : getBebeshoujiao3().hashCode());
        result = prime * result + ((getMark1() == null) ? 0 : getMark1().hashCode());
        result = prime * result + ((getMark2() == null) ? 0 : getMark2().hashCode());
        result = prime * result + ((getMark3() == null) ? 0 : getMark3().hashCode());
        result = prime * result + ((getLiushi1() == null) ? 0 : getLiushi1().hashCode());
        result = prime * result + ((getLiushi2() == null) ? 0 : getLiushi2().hashCode());
        result = prime * result + ((getLiushi3() == null) ? 0 : getLiushi3().hashCode());
        result = prime * result + ((getGhostnote1() == null) ? 0 : getGhostnote1().hashCode());
        result = prime * result + ((getGhostnote2() == null) ? 0 : getGhostnote2().hashCode());
        result = prime * result + ((getGhostnote3() == null) ? 0 : getGhostnote3().hashCode());
        result = prime * result + ((getGudian1() == null) ? 0 : getGudian1().hashCode());
        result = prime * result + ((getGudian2() == null) ? 0 : getGudian2().hashCode());
        result = prime * result + ((getGudian3() == null) ? 0 : getGudian3().hashCode());
        result = prime * result + ((getJibengong1() == null) ? 0 : getJibengong1().hashCode());
        result = prime * result + ((getJibengong2() == null) ? 0 : getJibengong2().hashCode());
        result = prime * result + ((getJibengong3() == null) ? 0 : getJibengong3().hashCode());
        result = prime * result + ((getPoly1() == null) ? 0 : getPoly1().hashCode());
        result = prime * result + ((getPoly2() == null) ? 0 : getPoly2().hashCode());
        result = prime * result + ((getPoly3() == null) ? 0 : getPoly3().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", shibatiao1=").append(shibatiao1);
        sb.append(", shibatiao2=").append(shibatiao2);
        sb.append(", shibatiao3=").append(shibatiao3);
        sb.append(", jazz1=").append(jazz1);
        sb.append(", jazz2=").append(jazz2);
        sb.append(", jazz3=").append(jazz3);
        sb.append(", bebeshiwu1=").append(bebeshiwu1);
        sb.append(", bebeshiwu2=").append(bebeshiwu2);
        sb.append(", bebeshiwu3=").append(bebeshiwu3);
        sb.append(", bebeshoujiao1=").append(bebeshoujiao1);
        sb.append(", bebeshoujiao2=").append(bebeshoujiao2);
        sb.append(", bebeshoujiao3=").append(bebeshoujiao3);
        sb.append(", mark1=").append(mark1);
        sb.append(", mark2=").append(mark2);
        sb.append(", mark3=").append(mark3);
        sb.append(", liushi1=").append(liushi1);
        sb.append(", liushi2=").append(liushi2);
        sb.append(", liushi3=").append(liushi3);
        sb.append(", ghostnote1=").append(ghostnote1);
        sb.append(", ghostnote2=").append(ghostnote2);
        sb.append(", ghostnote3=").append(ghostnote3);
        sb.append(", gudian1=").append(gudian1);
        sb.append(", gudian2=").append(gudian2);
        sb.append(", gudian3=").append(gudian3);
        sb.append(", jibengong1=").append(jibengong1);
        sb.append(", jibengong2=").append(jibengong2);
        sb.append(", jibengong3=").append(jibengong3);
        sb.append(", poly1=").append(poly1);
        sb.append(", poly2=").append(poly2);
        sb.append(", poly3=").append(poly3);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}