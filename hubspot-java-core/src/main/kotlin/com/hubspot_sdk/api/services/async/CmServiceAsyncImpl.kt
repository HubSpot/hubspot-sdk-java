// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.cms.AuditLogServiceAsync
import com.hubspot_sdk.api.services.async.cms.AuditLogServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.BlogServiceAsync
import com.hubspot_sdk.api.services.async.cms.BlogServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.DomainServiceAsync
import com.hubspot_sdk.api.services.async.cms.DomainServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.MediaBridgeServiceAsync
import com.hubspot_sdk.api.services.async.cms.MediaBridgeServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.SiteSearchServiceAsync
import com.hubspot_sdk.api.services.async.cms.SiteSearchServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.SourceCodeServiceAsync
import com.hubspot_sdk.api.services.async.cms.SourceCodeServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.UrlMappingServiceAsync
import com.hubspot_sdk.api.services.async.cms.UrlMappingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.UrlRedirectServiceAsync
import com.hubspot_sdk.api.services.async.cms.UrlRedirectServiceAsyncImpl
import java.util.function.Consumer

class CmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CmServiceAsync {

    private val withRawResponse: CmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auditLogs: AuditLogServiceAsync by lazy { AuditLogServiceAsyncImpl(clientOptions) }

    private val blogs: BlogServiceAsync by lazy { BlogServiceAsyncImpl(clientOptions) }

    private val domains: DomainServiceAsync by lazy { DomainServiceAsyncImpl(clientOptions) }

    private val mediaBridge: MediaBridgeServiceAsync by lazy {
        MediaBridgeServiceAsyncImpl(clientOptions)
    }

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

    override fun mediaBridge(): MediaBridgeServiceAsync = mediaBridge

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

        private val mediaBridge: MediaBridgeServiceAsync.WithRawResponse by lazy {
            MediaBridgeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun mediaBridge(): MediaBridgeServiceAsync.WithRawResponse = mediaBridge

        override fun siteSearch(): SiteSearchServiceAsync.WithRawResponse = siteSearch

        override fun sourceCode(): SourceCodeServiceAsync.WithRawResponse = sourceCode

        override fun urlMappings(): UrlMappingServiceAsync.WithRawResponse = urlMappings

        override fun urlRedirects(): UrlRedirectServiceAsync.WithRawResponse = urlRedirects
    }
}
