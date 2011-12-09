package com.soebes.patterns.state3;

/**
 * Enum type for states
 */
public enum State implements Transitions
{
    /**
     * Initial State - S
     */
    S
    {
        @Override
        public void readOne(Automaton a)
        {
            a.setState(X);
        }

        @Override
        public void readZero(Automaton a)
        {
            a.setState(A);
        }

        @Override
        public boolean isFinal()
        {
            return true;
        }
    },

    /**
     * Final State - A
     */
    A
    {
        @Override
        public void readOne(Automaton a)
        {
            a.setState(B);
        }

        @Override
        public void readZero(Automaton a)
        {
            a.setState(A);
        }

        @Override
        public boolean isFinal()
        {
            return true;
        }
    },

    /**
     * State -B
     */
    B
    {
        @Override
        public void readOne(Automaton a)
        {
            a.setState(B);
        }

        @Override
        public void readZero(Automaton a)
        {
            a.setState(A);
        }

        @Override
        public boolean isFinal()
        {
            return false;
        }
    },

    /**
     * Final State - X
     */
    X
    {
        @Override
        public void readOne(Automaton a)
        {
            a.setState(X);
        }

        @Override
        public void readZero(Automaton a)
        {
            a.setState(Y);
        }

        @Override
        public boolean isFinal()
        {
            return true;
        }
    },

    /**
     * State -Y
     */
    Y
    {
        @Override
        public void readOne(Automaton a)
        {
            a.setState(X);
        }

        @Override
        public void readZero(Automaton a)
        {
            a.setState(Y);
        }

        @Override
        public boolean isFinal()
        {
            return false;
        }
    };

    /**
     * Is state final?
     * 
     * @return true if final
     */
    abstract public boolean isFinal();
}