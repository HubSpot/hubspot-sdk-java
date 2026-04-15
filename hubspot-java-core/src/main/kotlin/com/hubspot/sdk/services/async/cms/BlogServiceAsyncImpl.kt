// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.cms.blogs.AuthorServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.AuthorServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.blogs.PostServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.PostServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.blogs.SettingServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.SettingServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.blogs.TagServiceAsync
import com.hubspot.sdk.services.async.cms.blogs.TagServiceAsyncImpl
import java.util.function.Consumer

class BlogServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BlogServiceAsync {

    private val withRawResponse: BlogServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val authors: AuthorServiceAsync by lazy { AuthorServiceAsyncImpl(clientOptions) }

    private val posts: PostServiceAsync by lazy { PostServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    private val tags: TagServiceAsync by lazy { TagServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BlogServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogServiceAsync =
        BlogServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun authors(): AuthorServiceAsync = authors

    override fun posts(): PostServiceAsync = posts

    override fun settings(): SettingServiceAsync = settings

    override fun tags(): TagServiceAsync = tags

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlogServiceAsync.WithRawResponse {

        private val authors: AuthorServiceAsync.WithRawResponse by lazy {
            AuthorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val posts: PostServiceAsync.WithRawResponse by lazy {
            PostServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tags: TagServiceAsync.WithRawResponse by lazy {
            TagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlogServiceAsync.WithRawResponse =
            BlogServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun authors(): AuthorServiceAsync.WithRawResponse = authors

        override fun posts(): PostServiceAsync.WithRawResponse = posts

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun tags(): TagServiceAsync.WithRawResponse = tags
    }
}
