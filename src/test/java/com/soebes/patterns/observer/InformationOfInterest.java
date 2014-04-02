package com.soebes.patterns.observer;

public class InformationOfInterest
{

    private String subjectId;

    private long currentRevision;

    private long revisions;

    public InformationOfInterest()
    {
    }

    public InformationOfInterest( final String subjectId, final long currentRevision, final long revisions )
    {
        super();
        this.subjectId = subjectId;
        this.currentRevision = currentRevision;
        this.revisions = revisions;
    }

    public long getCurrentRevision()
    {
        return currentRevision;
    }

    public InformationOfInterest setCurrentRevision( long currentRevision )
    {
        this.currentRevision = currentRevision;
        return this;
    }

    public long getRevisions()
    {
        return revisions;
    }

    public InformationOfInterest setRevisions( long revisions )
    {
        this.revisions = revisions;
        return this;
    }

    public String getSubjectId()
    {
        return subjectId;
    }

    public InformationOfInterest setSubjectId( String subjectId )
    {
        this.subjectId = subjectId;
        return this;
    }

}
