package com.bj.basic;

/**
 * Http executor
 *
 * @author Liu Dong
 */
interface HttpExecutor extends Interceptor.InvocationTarget {
    /**
     * Process the request, and return response
     */
    RawResponse proceed(Request request);
}
