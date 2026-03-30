// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.AuditLogService
import com.hubspot_sdk.api.services.blocking.cms.AuditLogServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.BlogService
import com.hubspot_sdk.api.services.blocking.cms.BlogServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.DomainService
import com.hubspot_sdk.api.services.blocking.cms.DomainServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.HubdbService
import com.hubspot_sdk.api.services.blocking.cms.HubdbServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.MediaBridgeService
import com.hubspot_sdk.api.services.blocking.cms.MediaBridgeServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.PageService
import com.hubspot_sdk.api.services.blocking.cms.PageServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.SiteSearchService
import com.hubspot_sdk.api.services.blocking.cms.SiteSearchServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.SourceCodeService
import com.hubspot_sdk.api.services.blocking.cms.SourceCodeServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.UrlMappingService
import com.hubspot_sdk.api.services.blocking.cms.UrlMappingServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.UrlRedirectService
import com.hubspot_sdk.api.services.blocking.cms.UrlRedirectServiceImpl
import java.util.function.Consumer

class CmServiceImpl internal constructor(private val clientOptions: ClientOptions) : CmService {

    private val withRawResponse: CmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auditLogs: AuditLogService by lazy { AuditLogServiceImpl(clientOptions) }

    private val blogs: BlogService by lazy { BlogServiceImpl(clientOptions) }

    private val domains: DomainService by lazy { DomainServiceImpl(clientOptions) }

    private val hubdb: HubdbService by lazy { HubdbServiceImpl(clientOptions) }

    private val mediaBridge: MediaBridgeService by lazy { MediaBridgeServiceImpl(clientOptions) }

    private val pages: PageService by lazy { PageServiceImpl(clientOptions) }

    private val siteSearch: SiteSearchService by lazy { SiteSearchServiceImpl(clientOptions) }

    private val sourceCode: SourceCodeService by lazy { SourceCodeServiceImpl(clientOptions) }

    private val urlMappings: UrlMappingService by lazy { UrlMappingServiceImpl(clientOptions) }

    private val urlRedirects: UrlRedirectService by lazy { UrlRedirectServiceImpl(clientOptions) }

    override fun withRawResponse(): CmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmService =
        CmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun auditLogs(): AuditLogService = auditLogs

    override fun blogs(): BlogService = blogs

    override fun domains(): DomainService = domains

    override fun hubdb(): HubdbService = hubdb

    override fun mediaBridge(): MediaBridgeService = mediaBridge

    override fun pages(): PageService = pages

    override fun siteSearch(): SiteSearchService = siteSearch

    override fun sourceCode(): SourceCodeService = sourceCode

    override fun urlMappings(): UrlMappingService = urlMappings

    override fun urlRedirects(): UrlRedirectService = urlRedirects

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CmService.WithRawResponse {

        private val auditLogs: AuditLogService.WithRawResponse by lazy {
            AuditLogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val blogs: BlogService.WithRawResponse by lazy {
            BlogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val domains: DomainService.WithRawResponse by lazy {
            DomainServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val hubdb: HubdbService.WithRawResponse by lazy {
            HubdbServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mediaBridge: MediaBridgeService.WithRawResponse by lazy {
            MediaBridgeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pages: PageService.WithRawResponse by lazy {
            PageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteSearch: SiteSearchService.WithRawResponse by lazy {
            SiteSearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sourceCode: SourceCodeService.WithRawResponse by lazy {
            SourceCodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val urlMappings: UrlMappingService.WithRawResponse by lazy {
            UrlMappingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val urlRedirects: UrlRedirectService.WithRawResponse by lazy {
            UrlRedirectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CmService.WithRawResponse =
            CmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun auditLogs(): AuditLogService.WithRawResponse = auditLogs

        override fun blogs(): BlogService.WithRawResponse = blogs

        override fun domains(): DomainService.WithRawResponse = domains

        override fun hubdb(): HubdbService.WithRawResponse = hubdb

        override fun mediaBridge(): MediaBridgeService.WithRawResponse = mediaBridge

        override fun pages(): PageService.WithRawResponse = pages

        override fun siteSearch(): SiteSearchService.WithRawResponse = siteSearch

        override fun sourceCode(): SourceCodeService.WithRawResponse = sourceCode

        override fun urlMappings(): UrlMappingService.WithRawResponse = urlMappings

        override fun urlRedirects(): UrlRedirectService.WithRawResponse = urlRedirects
    }
}
