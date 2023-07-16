package cw.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        // ITestListener.super.onTestStart(result);
        System.out.println(result.getName() + " isimli testimiz basladi");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // ITestListener.super.onTestSuccess(result);

        System.out.println(result.getName() + " isimli testimiz basariyla sonuclandi");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // ITestListener.super.onTestFailure(result);
        System.out.println(result.getName() + " isimli testimiz basarisiz oldu");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //  ITestListener.super.onTestSkipped(result);
        System.out.println(result.getName() + " isimli testimiz skip edildi");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println(result.getName() + " isimli testimiz timeout ile fail oldu");
    }

    @Override
    public void onStart(ITestContext context) {
        //ITestListener.super.onStart(context);
        System.out.println("test execution basladigi an ");

        System.out.println("baslangic saati : " + context.getStartDate().toString());
    }

    @Override
    public void onFinish(ITestContext context) {
        // ITestListener.super.onFinish(context); System.out.println("test execution basladigi an ");
        System.out.println("test execution bittigi an ");
        System.out.println("bitissaati : " + context.getEndDate().toString());
    }
}
