// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.cms.blogs.PostServiceAsync
import com.hubspot_sdk.api.services.async.cms.blogs.PostServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.blogs.SettingServiceAsync
import com.hubspot_sdk.api.services.async.cms.blogs.SettingServiceAsyncImpl
import java.util.function.Consumer

class BlogServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BlogServiceAsync {

    private val withRawResponse: BlogServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val posts: PostServiceAsync by lazy { PostServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BlogServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogServiceAsync =
        BlogServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun posts(): PostServiceAsync = posts

    override fun settings(): SettingServiceAsync = settings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlogServiceAsync.WithRawResponse {

        private val posts: PostServiceAsync.WithRawResponse by lazy {
            PostServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlogServiceAsync.WithRawResponse =
            BlogServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun posts(): PostServiceAsync.WithRawResponse = posts

        override fun settings(): SettingServiceAsync.WithRawResponse = settings
    }
}
