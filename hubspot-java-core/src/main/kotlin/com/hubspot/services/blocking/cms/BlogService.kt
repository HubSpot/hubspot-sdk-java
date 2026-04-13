// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.cms.blogs.AuthorService
import com.hubspot.services.blocking.cms.blogs.PostService
import com.hubspot.services.blocking.cms.blogs.SettingService
import com.hubspot.services.blocking.cms.blogs.TagService
import java.util.function.Consumer

interface BlogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogService

    fun authors(): AuthorService

    fun posts(): PostService

    fun settings(): SettingService

    fun tags(): TagService

    /** A view of [BlogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogService.WithRawResponse

        fun authors(): AuthorService.WithRawResponse

        fun posts(): PostService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun tags(): TagService.WithRawResponse
    }
}
