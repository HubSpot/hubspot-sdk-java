// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.cms.AuditLogServiceAsync
import com.hubspot.services.async.cms.BlogServiceAsync
import com.hubspot.services.async.cms.DomainServiceAsync
import com.hubspot.services.async.cms.HubdbServiceAsync
import com.hubspot.services.async.cms.MediaBridgeServiceAsync
import com.hubspot.services.async.cms.PageServiceAsync
import com.hubspot.services.async.cms.SiteSearchServiceAsync
import com.hubspot.services.async.cms.SourceCodeServiceAsync
import com.hubspot.services.async.cms.UrlMappingServiceAsync
import com.hubspot.services.async.cms.UrlRedirectServiceAsync
import java.util.function.Consumer

interface CmServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmServiceAsync

    fun auditLogs(): AuditLogServiceAsync

    fun blogs(): BlogServiceAsync

    fun domains(): DomainServiceAsync

    fun hubdb(): HubdbServiceAsync

    fun mediaBridge(): MediaBridgeServiceAsync

    fun pages(): PageServiceAsync

    fun siteSearch(): SiteSearchServiceAsync

    fun sourceCode(): SourceCodeServiceAsync

    fun urlMappings(): UrlMappingServiceAsync

    fun urlRedirects(): UrlRedirectServiceAsync

    /** A view of [CmServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmServiceAsync.WithRawResponse

        fun auditLogs(): AuditLogServiceAsync.WithRawResponse

        fun blogs(): BlogServiceAsync.WithRawResponse

        fun domains(): DomainServiceAsync.WithRawResponse

        fun hubdb(): HubdbServiceAsync.WithRawResponse

        fun mediaBridge(): MediaBridgeServiceAsync.WithRawResponse

        fun pages(): PageServiceAsync.WithRawResponse

        fun siteSearch(): SiteSearchServiceAsync.WithRawResponse

        fun sourceCode(): SourceCodeServiceAsync.WithRawResponse

        fun urlMappings(): UrlMappingServiceAsync.WithRawResponse

        fun urlRedirects(): UrlRedirectServiceAsync.WithRawResponse
    }
}
