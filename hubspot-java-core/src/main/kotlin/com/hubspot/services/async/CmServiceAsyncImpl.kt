// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.cms.AuditLogServiceAsync
import com.hubspot.services.async.cms.AuditLogServiceAsyncImpl
import com.hubspot.services.async.cms.BlogServiceAsync
import com.hubspot.services.async.cms.BlogServiceAsyncImpl
import com.hubspot.services.async.cms.DomainServiceAsync
import com.hubspot.services.async.cms.DomainServiceAsyncImpl
import com.hubspot.services.async.cms.HubdbServiceAsync
import com.hubspot.services.async.cms.HubdbServiceAsyncImpl
import com.hubspot.services.async.cms.MediaBridgeServiceAsync
import com.hubspot.services.async.cms.MediaBridgeServiceAsyncImpl
import com.hubspot.services.async.cms.PageServiceAsync
import com.hubspot.services.async.cms.PageServiceAsyncImpl
import com.hubspot.services.async.cms.SiteSearchServiceAsync
import com.hubspot.services.async.cms.SiteSearchServiceAsyncImpl
import com.hubspot.services.async.cms.SourceCodeServiceAsync
import com.hubspot.services.async.cms.SourceCodeServiceAsyncImpl
import com.hubspot.services.async.cms.UrlMappingServiceAsync
import com.hubspot.services.async.cms.UrlMappingServiceAsyncImpl
import com.hubspot.services.async.cms.UrlRedirectServiceAsync
import com.hubspot.services.async.cms.UrlRedirectServiceAsyncImpl
import java.util.function.Consumer

class CmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CmServiceAsync {

    private val withRawResponse: CmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auditLogs: AuditLogServiceAsync by lazy { AuditLogServiceAsyncImpl(clientOptions) }

    private val blogs: BlogServiceAsync by lazy { BlogServiceAsyncImpl(clientOptions) }

    private val domains: DomainServiceAsync by lazy { DomainServiceAsyncImpl(clientOptions) }

    private val hubdb: HubdbServiceAsync by lazy { HubdbServiceAsyncImpl(clientOptions) }

    private val mediaBridge: MediaBridgeServiceAsync by lazy {
        MediaBridgeServiceAsyncImpl(clientOptions)
    }

    private val pages: PageServiceAsync by lazy { PageServiceAsyncImpl(clientOptions) }

    private val siteSearch: SiteSearchServiceAsync by lazy {
        SiteSearchServiceAsyncImpl(clientOptions)
    }

    private val sourceCode: SourceCodeServiceAsync by lazy {
        SourceCodeServiceAsyncImpl(clientOptions)
    }

    private val urlMappings: UrlMappingServiceAsync by lazy {
        UrlMappingServiceAsyncImpl(clientOptions)
    }

    private val urlRedirects: UrlRedirectServiceAsync by lazy {
        UrlRedirectServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CmServiceAsync =
        CmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun auditLogs(): AuditLogServiceAsync = auditLogs

    override fun blogs(): BlogServiceAsync = blogs

    override fun domains(): DomainServiceAsync = domains

    override fun hubdb(): HubdbServiceAsync = hubdb

    override fun mediaBridge(): MediaBridgeServiceAsync = mediaBridge

    override fun pages(): PageServiceAsync = pages

    override fun siteSearch(): SiteSearchServiceAsync = siteSearch

    override fun sourceCode(): SourceCodeServiceAsync = sourceCode

    override fun urlMappings(): UrlMappingServiceAsync = urlMappings

    override fun urlRedirects(): UrlRedirectServiceAsync = urlRedirects

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CmServiceAsync.WithRawResponse {

        private val auditLogs: AuditLogServiceAsync.WithRawResponse by lazy {
            AuditLogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val blogs: BlogServiceAsync.WithRawResponse by lazy {
            BlogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val domains: DomainServiceAsync.WithRawResponse by lazy {
            DomainServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val hubdb: HubdbServiceAsync.WithRawResponse by lazy {
            HubdbServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mediaBridge: MediaBridgeServiceAsync.WithRawResponse by lazy {
            MediaBridgeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pages: PageServiceAsync.WithRawResponse by lazy {
            PageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteSearch: SiteSearchServiceAsync.WithRawResponse by lazy {
            SiteSearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sourceCode: SourceCodeServiceAsync.WithRawResponse by lazy {
            SourceCodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val urlMappings: UrlMappingServiceAsync.WithRawResponse by lazy {
            UrlMappingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val urlRedirects: UrlRedirectServiceAsync.WithRawResponse by lazy {
            UrlRedirectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CmServiceAsync.WithRawResponse =
            CmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun auditLogs(): AuditLogServiceAsync.WithRawResponse = auditLogs

        override fun blogs(): BlogServiceAsync.WithRawResponse = blogs

        override fun domains(): DomainServiceAsync.WithRawResponse = domains

        override fun hubdb(): HubdbServiceAsync.WithRawResponse = hubdb

        override fun mediaBridge(): MediaBridgeServiceAsync.WithRawResponse = mediaBridge

        override fun pages(): PageServiceAsync.WithRawResponse = pages

        override fun siteSearch(): SiteSearchServiceAsync.WithRawResponse = siteSearch

        override fun sourceCode(): SourceCodeServiceAsync.WithRawResponse = sourceCode

        override fun urlMappings(): UrlMappingServiceAsync.WithRawResponse = urlMappings

        override fun urlRedirects(): UrlRedirectServiceAsync.WithRawResponse = urlRedirects
    }
}
