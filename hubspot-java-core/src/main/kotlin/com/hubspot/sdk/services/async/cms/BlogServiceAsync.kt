// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.cms.blogs.AuthorServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.PostServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.SettingServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.TagServiceAsync
import java.util.function.Consumer

interface BlogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogServiceAsync

    fun authors(): AuthorServiceAsync

    fun posts(): PostServiceAsync

    fun settings(): SettingServiceAsync

    fun tags(): TagServiceAsync

    /** A view of [BlogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogServiceAsync.WithRawResponse

        fun authors(): AuthorServiceAsync.WithRawResponse

        fun posts(): PostServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun tags(): TagServiceAsync.WithRawResponse
    }
}
