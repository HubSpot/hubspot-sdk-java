// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.AuditLogService
import com.hubspot_sdk.api.services.blocking.cms.BlogService
import com.hubspot_sdk.api.services.blocking.cms.DomainService
import com.hubspot_sdk.api.services.blocking.cms.MediaBridgeService
import com.hubspot_sdk.api.services.blocking.cms.SiteSearchService
import com.hubspot_sdk.api.services.blocking.cms.SourceCodeService
import com.hubspot_sdk.api.services.blocking.cms.UrlMappingService
import com.hubspot_sdk.api.services.blocking.cms.UrlRedirectService
import java.util.function.Consumer

interface CmService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmService

    fun auditLogs(): AuditLogService

    fun blogs(): BlogService

    fun domains(): DomainService

    fun mediaBridge(): MediaBridgeService

    fun siteSearch(): SiteSearchService

    fun sourceCode(): SourceCodeService

    fun urlMappings(): UrlMappingService

    fun urlRedirects(): UrlRedirectService

    /** A view of [CmService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmService.WithRawResponse

        fun auditLogs(): AuditLogService.WithRawResponse

        fun blogs(): BlogService.WithRawResponse

        fun domains(): DomainService.WithRawResponse

        fun mediaBridge(): MediaBridgeService.WithRawResponse

        fun siteSearch(): SiteSearchService.WithRawResponse

        fun sourceCode(): SourceCodeService.WithRawResponse

        fun urlMappings(): UrlMappingService.WithRawResponse

        fun urlRedirects(): UrlRedirectService.WithRawResponse
    }
}
