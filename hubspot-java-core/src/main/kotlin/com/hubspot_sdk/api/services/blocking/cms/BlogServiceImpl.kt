// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.blogs.AuthorService
import com.hubspot_sdk.api.services.blocking.cms.blogs.AuthorServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.blogs.PostService
import com.hubspot_sdk.api.services.blocking.cms.blogs.PostServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.blogs.SettingService
import com.hubspot_sdk.api.services.blocking.cms.blogs.SettingServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.blogs.TagService
import com.hubspot_sdk.api.services.blocking.cms.blogs.TagServiceImpl
import java.util.function.Consumer

class BlogServiceImpl internal constructor(private val clientOptions: ClientOptions) : BlogService {

    private val withRawResponse: BlogService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val authors: AuthorService by lazy { AuthorServiceImpl(clientOptions) }

    private val posts: PostService by lazy { PostServiceImpl(clientOptions) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    private val tags: TagService by lazy { TagServiceImpl(clientOptions) }

    override fun withRawResponse(): BlogService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlogService =
        BlogServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun authors(): AuthorService = authors

    override fun posts(): PostService = posts

    override fun settings(): SettingService = settings

    override fun tags(): TagService = tags

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlogService.WithRawResponse {

        private val authors: AuthorService.WithRawResponse by lazy {
            AuthorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val posts: PostService.WithRawResponse by lazy {
            PostServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tags: TagService.WithRawResponse by lazy {
            TagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlogService.WithRawResponse =
            BlogServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun authors(): AuthorService.WithRawResponse = authors

        override fun posts(): PostService.WithRawResponse = posts

        override fun settings(): SettingService.WithRawResponse = settings

        override fun tags(): TagService.WithRawResponse = tags
    }
}
