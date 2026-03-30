// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.BlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCloneParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetDraftByIdParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListAuthorsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListTagsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostPushLiveParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostQueryAuthorsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostQueryParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostQueryTagsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostResetDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostScheduleParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateParams
import com.hubspot_sdk.api.services.blocking.cms.blogs.posts.BatchService
import com.hubspot_sdk.api.services.blocking.cms.blogs.posts.MultiLanguageService
import com.hubspot_sdk.api.services.blocking.cms.blogs.posts.RevisionService
import java.util.function.Consumer

interface PostService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService

    fun batch(): BatchService

    fun multiLanguage(): MultiLanguageService

    fun revisions(): RevisionService

    /** Create a new blog post, specifying its content in the request body. */
    @MustBeClosed
    fun create(params: PostCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(
        blogPost: BlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

    /** @see create */
    @MustBeClosed
    fun create(blogPost: BlogPost): HttpResponse = create(blogPost, RequestOptions.none())

    /**
     * Partially updates a single blog post by ID. You only need to specify the values that you want
     * to update.
     */
    @MustBeClosed
    fun update(objectId: String, params: PostUpdateParams): HttpResponse =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        objectId: String,
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    @MustBeClosed
    fun update(params: PostUpdateParams): HttpResponse = update(params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    @MustBeClosed fun list(): HttpResponse = list(PostListParams.none())

    /** @see list */
    @MustBeClosed
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see list */
    @MustBeClosed
    fun list(params: PostListParams = PostListParams.none()): HttpResponse =
        list(params, RequestOptions.none())

    /** @see list */
    @MustBeClosed
    fun list(requestOptions: RequestOptions): HttpResponse =
        list(PostListParams.none(), requestOptions)

    /** Delete a blog post by ID. */
    fun delete(objectId: String) = delete(objectId, PostDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: PostDeleteParams = PostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: PostDeleteParams = PostDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PostDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: PostDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, PostDeleteParams.none(), requestOptions)

    /** Clone a blog post, making a copy of it in a new blog post. */
    @MustBeClosed
    fun clone(params: PostCloneParams): HttpResponse = clone(params, RequestOptions.none())

    /** @see clone */
    @MustBeClosed
    fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see clone */
    @MustBeClosed
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        clone(
            PostCloneParams.builder().contentCloneRequestVNext(contentCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    @MustBeClosed
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponse =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a blog post by the post ID. */
    @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, PostGetParams.none())

    /** @see get */
    @MustBeClosed
    fun get(
        objectId: String,
        params: PostGetParams = PostGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, params: PostGetParams = PostGetParams.none()): HttpResponse =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: PostGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed fun get(params: PostGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
        get(objectId, PostGetParams.none(), requestOptions)

    /** Retrieve the full draft version of a blog post. */
    @MustBeClosed
    fun getDraftById(objectId: String): HttpResponse =
        getDraftById(objectId, PostGetDraftByIdParams.none())

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
    ): HttpResponse = getDraftById(objectId, params, RequestOptions.none())

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(params: PostGetDraftByIdParams): HttpResponse =
        getDraftById(params, RequestOptions.none())

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(objectId: String, requestOptions: RequestOptions): HttpResponse =
        getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

    @MustBeClosed fun listAuthors(): HttpResponse = listAuthors(PostListAuthorsParams.none())

    /** @see listAuthors */
    @MustBeClosed
    fun listAuthors(
        params: PostListAuthorsParams = PostListAuthorsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listAuthors */
    @MustBeClosed
    fun listAuthors(params: PostListAuthorsParams = PostListAuthorsParams.none()): HttpResponse =
        listAuthors(params, RequestOptions.none())

    /** @see listAuthors */
    @MustBeClosed
    fun listAuthors(requestOptions: RequestOptions): HttpResponse =
        listAuthors(PostListAuthorsParams.none(), requestOptions)

    @MustBeClosed fun listTags(): HttpResponse = listTags(PostListTagsParams.none())

    /** @see listTags */
    @MustBeClosed
    fun listTags(
        params: PostListTagsParams = PostListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listTags */
    @MustBeClosed
    fun listTags(params: PostListTagsParams = PostListTagsParams.none()): HttpResponse =
        listTags(params, RequestOptions.none())

    /** @see listTags */
    @MustBeClosed
    fun listTags(requestOptions: RequestOptions): HttpResponse =
        listTags(PostListTagsParams.none(), requestOptions)

    /** Publish the draft version of the blog post, sending its content to the live page. */
    fun pushLive(objectId: String) = pushLive(objectId, PostPushLiveParams.none())

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: PostPushLiveParams = PostPushLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushLive */
    fun pushLive(objectId: String, params: PostPushLiveParams = PostPushLiveParams.none()) =
        pushLive(objectId, params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(params: PostPushLiveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see pushLive */
    fun pushLive(params: PostPushLiveParams) = pushLive(params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(objectId: String, requestOptions: RequestOptions) =
        pushLive(objectId, PostPushLiveParams.none(), requestOptions)

    @MustBeClosed fun query(): HttpResponse = query(PostQueryParams.none())

    /** @see query */
    @MustBeClosed
    fun query(
        params: PostQueryParams = PostQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see query */
    @MustBeClosed
    fun query(params: PostQueryParams = PostQueryParams.none()): HttpResponse =
        query(params, RequestOptions.none())

    /** @see query */
    @MustBeClosed
    fun query(requestOptions: RequestOptions): HttpResponse =
        query(PostQueryParams.none(), requestOptions)

    @MustBeClosed fun queryAuthors(): HttpResponse = queryAuthors(PostQueryAuthorsParams.none())

    /** @see queryAuthors */
    @MustBeClosed
    fun queryAuthors(
        params: PostQueryAuthorsParams = PostQueryAuthorsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see queryAuthors */
    @MustBeClosed
    fun queryAuthors(params: PostQueryAuthorsParams = PostQueryAuthorsParams.none()): HttpResponse =
        queryAuthors(params, RequestOptions.none())

    /** @see queryAuthors */
    @MustBeClosed
    fun queryAuthors(requestOptions: RequestOptions): HttpResponse =
        queryAuthors(PostQueryAuthorsParams.none(), requestOptions)

    @MustBeClosed fun queryTags(): HttpResponse = queryTags(PostQueryTagsParams.none())

    /** @see queryTags */
    @MustBeClosed
    fun queryTags(
        params: PostQueryTagsParams = PostQueryTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see queryTags */
    @MustBeClosed
    fun queryTags(params: PostQueryTagsParams = PostQueryTagsParams.none()): HttpResponse =
        queryTags(params, RequestOptions.none())

    /** @see queryTags */
    @MustBeClosed
    fun queryTags(requestOptions: RequestOptions): HttpResponse =
        queryTags(PostQueryTagsParams.none(), requestOptions)

    /**
     * Discard all drafted content, resetting the draft to contain the content in the currently
     * published version.
     */
    fun resetDraft(objectId: String) = resetDraft(objectId, PostResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PostResetDraftParams = PostResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(objectId: String, params: PostResetDraftParams = PostResetDraftParams.none()) =
        resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: PostResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: PostResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions) =
        resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

    /** Schedule a blog post to be published at a specified time. */
    fun schedule(params: PostScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(params: PostScheduleParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            PostScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    /**
     * Partially updates the draft version of a single blog post by ID. You only need to specify the
     * values that you want to update.
     */
    @MustBeClosed
    fun updateDraft(objectId: String, params: PostUpdateDraftParams): HttpResponse =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    @MustBeClosed
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    @MustBeClosed
    fun updateDraft(params: PostUpdateDraftParams): HttpResponse =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    @MustBeClosed
    fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [PostService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun multiLanguage(): MultiLanguageService.WithRawResponse

        fun revisions(): RevisionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts`, but is otherwise the
         * same as [PostService.create].
         */
        @MustBeClosed
        fun create(params: PostCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            blogPost: BlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(blogPost: BlogPost): HttpResponse = create(blogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: PostUpdateParams): HttpResponse =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PostUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor`, but is otherwise
         * the same as [PostService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(PostListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: PostListParams = PostListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, PostDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PostDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, PostDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/clone`, but is otherwise
         * the same as [PostService.clone].
         */
        @MustBeClosed
        fun clone(params: PostCloneParams): HttpResponse = clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            clone(
                PostCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponse =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostService.get].
         */
        @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, PostGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: PostGetParams = PostGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, params: PostGetParams = PostGetParams.none()): HttpResponse =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PostGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: PostGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
            get(objectId, PostGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostService.getDraftById].
         */
        @MustBeClosed
        fun getDraftById(objectId: String): HttpResponse =
            getDraftById(objectId, PostGetDraftByIdParams.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        ): HttpResponse = getDraftById(objectId, params, RequestOptions.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(params: PostGetDraftByIdParams): HttpResponse =
            getDraftById(params, RequestOptions.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(objectId: String, requestOptions: RequestOptions): HttpResponse =
            getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor`, but is otherwise
         * the same as [PostService.listAuthors].
         */
        @MustBeClosed fun listAuthors(): HttpResponse = listAuthors(PostListAuthorsParams.none())

        /** @see listAuthors */
        @MustBeClosed
        fun listAuthors(
            params: PostListAuthorsParams = PostListAuthorsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listAuthors */
        @MustBeClosed
        fun listAuthors(
            params: PostListAuthorsParams = PostListAuthorsParams.none()
        ): HttpResponse = listAuthors(params, RequestOptions.none())

        /** @see listAuthors */
        @MustBeClosed
        fun listAuthors(requestOptions: RequestOptions): HttpResponse =
            listAuthors(PostListAuthorsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor`, but is otherwise
         * the same as [PostService.listTags].
         */
        @MustBeClosed fun listTags(): HttpResponse = listTags(PostListTagsParams.none())

        /** @see listTags */
        @MustBeClosed
        fun listTags(
            params: PostListTagsParams = PostListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listTags */
        @MustBeClosed
        fun listTags(params: PostListTagsParams = PostListTagsParams.none()): HttpResponse =
            listTags(params, RequestOptions.none())

        /** @see listTags */
        @MustBeClosed
        fun listTags(requestOptions: RequestOptions): HttpResponse =
            listTags(PostListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/draft/push-live`, but is otherwise the same as
         * [PostService.pushLive].
         */
        @MustBeClosed
        fun pushLive(objectId: String): HttpResponse = pushLive(objectId, PostPushLiveParams.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
        ): HttpResponse = pushLive(objectId, params, RequestOptions.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            params: PostPushLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(params: PostPushLiveParams): HttpResponse =
            pushLive(params, RequestOptions.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(objectId: String, requestOptions: RequestOptions): HttpResponse =
            pushLive(objectId, PostPushLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor/query`, but is
         * otherwise the same as [PostService.query].
         */
        @MustBeClosed fun query(): HttpResponse = query(PostQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: PostQueryParams = PostQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see query */
        @MustBeClosed
        fun query(params: PostQueryParams = PostQueryParams.none()): HttpResponse =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponse =
            query(PostQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor/query`, but is
         * otherwise the same as [PostService.queryAuthors].
         */
        @MustBeClosed fun queryAuthors(): HttpResponse = queryAuthors(PostQueryAuthorsParams.none())

        /** @see queryAuthors */
        @MustBeClosed
        fun queryAuthors(
            params: PostQueryAuthorsParams = PostQueryAuthorsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see queryAuthors */
        @MustBeClosed
        fun queryAuthors(
            params: PostQueryAuthorsParams = PostQueryAuthorsParams.none()
        ): HttpResponse = queryAuthors(params, RequestOptions.none())

        /** @see queryAuthors */
        @MustBeClosed
        fun queryAuthors(requestOptions: RequestOptions): HttpResponse =
            queryAuthors(PostQueryAuthorsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor/query`, but is
         * otherwise the same as [PostService.queryTags].
         */
        @MustBeClosed fun queryTags(): HttpResponse = queryTags(PostQueryTagsParams.none())

        /** @see queryTags */
        @MustBeClosed
        fun queryTags(
            params: PostQueryTagsParams = PostQueryTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see queryTags */
        @MustBeClosed
        fun queryTags(params: PostQueryTagsParams = PostQueryTagsParams.none()): HttpResponse =
            queryTags(params, RequestOptions.none())

        /** @see queryTags */
        @MustBeClosed
        fun queryTags(requestOptions: RequestOptions): HttpResponse =
            queryTags(PostQueryTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/{objectId}/draft/reset`,
         * but is otherwise the same as [PostService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(objectId: String): HttpResponse =
            resetDraft(objectId, PostResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
        ): HttpResponse = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: PostResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: PostResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/schedule`, but is
         * otherwise the same as [PostService.schedule].
         */
        @MustBeClosed
        fun schedule(params: PostScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: PostScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                PostScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        @MustBeClosed
        fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext): HttpResponse =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(objectId: String, params: PostUpdateDraftParams): HttpResponse =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: PostUpdateDraftParams): HttpResponse =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
