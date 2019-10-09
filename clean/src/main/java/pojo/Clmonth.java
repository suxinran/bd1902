package pojo;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Date;

public class Clmonth implements WritableComparable<Clmonth> {
    private String channelOrderId;
    private String channelName;
    private String cityName;
    private String productName;
    private String useTime;
    private String beginAddr;
    private String endAddr;
    private String carType;
    private String brandName;
    private Double estimatePrice;
    private Double estimateDistance;
    private Double estimateTimeLength;
    private String climbTime;
    private String createTime;

    public String getChannelOrderId() {
        return channelOrderId;
    }

    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getBeginAddr() {
        return beginAddr;
    }

    public void setBeginAddr(String beginAddr) {
        this.beginAddr = beginAddr;
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getEstimatePrice() {
        return estimatePrice;
    }

    public void setEstimatePrice(Double estimatePrice) {
        this.estimatePrice = estimatePrice;
    }

    public Double getEstimateDistance() {
        return estimateDistance;
    }

    public void setEstimateDistance(Double estimateDistance) {
        this.estimateDistance = estimateDistance;
    }

    public Double getEstimateTimeLength() {
        return estimateTimeLength;
    }

    public void setEstimateTimeLength(Double estimateTimeLength) {
        this.estimateTimeLength = estimateTimeLength;
    }

    public String getClimbTime() {
        return climbTime;
    }

    public void setClimbTime(String climbTime) {
        this.climbTime = climbTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeUTF(getChannelOrderId());
        out.writeUTF(getChannelName());
        out.writeUTF(getCityName());
        out.writeUTF(getProductName());
        out.writeUTF(getUseTime());
        out.writeUTF(getBeginAddr());
        out.writeUTF(getEndAddr());
        out.writeUTF(getCarType());
        out.writeUTF(getBrandName());
        out.writeDouble(getEstimatePrice());
        out.writeDouble(getEstimateDistance());
        out.writeDouble(getEstimateTimeLength());
        out.writeUTF(getClimbTime());
        out.writeUTF(getCreateTime());

    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.channelOrderId = in.readUTF();
        this.channelName = in.readUTF();
        this.cityName = in.readUTF();
        this.productName = in.readUTF();
        this.useTime = in.readUTF();
        this.beginAddr = in.readUTF();
        this.endAddr = in.readUTF();
        this.carType = in.readUTF();
        this.brandName = in.readUTF();
        this.estimatePrice = in.readDouble();
        this.estimateDistance = in.readDouble();
        this.estimateTimeLength = in.readDouble();
        this.climbTime = in.readUTF();
        this.createTime = in.readUTF();

    }

    @Override
    public int compareTo(Clmonth o) {
        return 0;
    }

    @Override
    public String toString() {
        return channelOrderId +'\t'+channelName + '\t' + cityName + '\t' + productName + '\t' + useTime + '\t' + beginAddr + '\t' + endAddr + '\t' + carType + '\t' + brandName + '\t' + estimatePrice +'\t'+ estimateDistance +'\t'+ estimateTimeLength +'\t'+ climbTime +'\t'+ createTime ;

    }
}
