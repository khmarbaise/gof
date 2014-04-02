package com.soebes.patterns.observer;

public class ScanRepositorySubject
    extends Subject
{
    private InformationOfInterest state;

    public InformationOfInterest getState()
    {
        return this.state;
    }

    public void setState( InformationOfInterest state )
    {
        this.state = state;
    }
}
