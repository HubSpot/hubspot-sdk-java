// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.blogs

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.cms.ContentCloneRequestVNext
import com.hubspot.models.cms.ContentScheduleRequestVNext
import com.hubspot.models.cms.blogs.posts.BlogPost
import com.hubspot.models.cms.blogs.posts.PostCloneParams
import com.hubspot.models.cms.blogs.posts.PostCreateParams
import com.hubspot.models.cms.blogs.posts.PostDeleteParams
import com.hubspot.models.cms.blogs.posts.PostGetDraftByIdParams
import com.hubspot.models.cms.blogs.posts.PostGetParams
import com.hubspot.models.cms.blogs.posts.PostListAuthorsParams
import com.hubspot.models.cms.blogs.posts.PostListParams
import com.hubspot.models.cms.blogs.posts.PostListTagsParams
import com.hubspot.models.cms.blogs.posts.PostPushLiveParams
import com.hubspot.models.cms.blogs.posts.PostQueryAuthorsParams
import com.hubspot.models.cms.blogs.posts.PostQueryParams
import com.hubspot.models.cms.blogs.posts.PostQueryTagsParams
import com.hubspot.models.cms.blogs.posts.PostResetDraftParams
import com.hubspot.models.cms.blogs.posts.PostScheduleParams
import com.hubspot.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot.models.cms.blogs.posts.PostUpdateParams
import com.hubspot.services.async.cms.blogs.posts.BatchServiceAsync
import com.hubspot.services.async.cms.blogs.posts.MultiLanguageServiceAsync
import com.hubspot.services.async.cms.blogs.posts.RevisionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync

    fun batch(): BatchServiceAsync

    fun multiLanguage(): MultiLanguageServiceAsync

    fun revisions(): RevisionServiceAsync

    /** Create a new blog post, specifying its content in the request body. */
    fun create(params: PostCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        blogPost: BlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

    /** @see create */
    fun create(blogPost: BlogPost): CompletableFuture<HttpResponse> =
        create(blogPost, RequestOptions.none())

    /**
     * Partially updates a single blog post by ID. You only need to specify the values that you want
     * to update.
     */
    fun update(objectId: String, params: PostUpdateParams): CompletableFuture<HttpResponse> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: PostUpdateParams): CompletableFuture<HttpResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun list(): CompletableFuture<HttpResponse> = list(PostListParams.none())

    /** @see list */
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see list */
    fun list(params: PostListParams = PostListParams.none()): CompletableFuture<HttpResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        list(PostListParams.none(), requestOptions)

    /** Delete a blog post by ID. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, PostDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: PostDeleteParams = PostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: PostDeleteParams = PostDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PostDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, PostDeleteParams.none(), requestOptions)

    /** Clone a blog post, making a copy of it in a new blog post. */
    fun clone(params: PostCloneParams): CompletableFuture<HttpResponse> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        clone(
            PostCloneParams.builder().contentCloneRequestVNext(contentCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<HttpResponse> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a blog post by the post ID. */
    fun get(objectId: String): CompletableFuture<HttpResponse> = get(objectId, PostGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: PostGetParams = PostGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: PostGetParams = PostGetParams.none(),
    ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(params: PostGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        get(objectId, PostGetParams.none(), requestOptions)

    /** Retrieve the full draft version of a blog post. */
    fun getDraftById(objectId: String): CompletableFuture<HttpResponse> =
        getDraftById(objectId, PostGetDraftByIdParams.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
    ): CompletableFuture<HttpResponse> = getDraftById(objectId, params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getDraftById */
    fun getDraftById(params: PostGetDraftByIdParams): CompletableFuture<HttpResponse> =
        getDraftById(params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

    fun listAuthors(): CompletableFuture<HttpResponse> = listAuthors(PostListAuthorsParams.none())

    /** @see listAuthors */
    fun listAuthors(
        params: PostListAuthorsParams = PostListAuthorsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listAuthors */
    fun listAuthors(
        params: PostListAuthorsParams = PostListAuthorsParams.none()
    ): CompletableFuture<HttpResponse> = listAuthors(params, RequestOptions.none())

    /** @see listAuthors */
    fun listAuthors(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listAuthors(PostListAuthorsParams.none(), requestOptions)

    fun listTags(): CompletableFuture<HttpResponse> = listTags(PostListTagsParams.none())

    /** @see listTags */
    fun listTags(
        params: PostListTagsParams = PostListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listTags */
    fun listTags(
        params: PostListTagsParams = PostListTagsParams.none()
    ): CompletableFuture<HttpResponse> = listTags(params, RequestOptions.none())

    /** @see listTags */
    fun listTags(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listTags(PostListTagsParams.none(), requestOptions)

    /** Publish the draft version of the blog post, sending its content to the live page. */
    fun pushLive(objectId: String): CompletableFuture<Void?> =
        pushLive(objectId, PostPushLiveParams.none())

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: PostPushLiveParams = PostPushLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: PostPushLiveParams = PostPushLiveParams.none(),
    ): CompletableFuture<Void?> = pushLive(objectId, params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(
        params: PostPushLiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see pushLive */
    fun pushLive(params: PostPushLiveParams): CompletableFuture<Void?> =
        pushLive(params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        pushLive(objectId, PostPushLiveParams.none(), requestOptions)

    fun query(): CompletableFuture<HttpResponse> = query(PostQueryParams.none())

    /** @see query */
    fun query(
        params: PostQueryParams = PostQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see query */
    fun query(params: PostQueryParams = PostQueryParams.none()): CompletableFuture<HttpResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        query(PostQueryParams.none(), requestOptions)

    fun queryAuthors(): CompletableFuture<HttpResponse> =
        queryAuthors(PostQueryAuthorsParams.none())

    /** @see queryAuthors */
    fun queryAuthors(
        params: PostQueryAuthorsParams = PostQueryAuthorsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see queryAuthors */
    fun queryAuthors(
        params: PostQueryAuthorsParams = PostQueryAuthorsParams.none()
    ): CompletableFuture<HttpResponse> = queryAuthors(params, RequestOptions.none())

    /** @see queryAuthors */
    fun queryAuthors(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        queryAuthors(PostQueryAuthorsParams.none(), requestOptions)

    fun queryTags(): CompletableFuture<HttpResponse> = queryTags(PostQueryTagsParams.none())

    /** @see queryTags */
    fun queryTags(
        params: PostQueryTagsParams = PostQueryTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see queryTags */
    fun queryTags(
        params: PostQueryTagsParams = PostQueryTagsParams.none()
    ): CompletableFuture<HttpResponse> = queryTags(params, RequestOptions.none())

    /** @see queryTags */
    fun queryTags(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        queryTags(PostQueryTagsParams.none(), requestOptions)

    /**
     * Discard all drafted content, resetting the draft to contain the content in the currently
     * published version.
     */
    fun resetDraft(objectId: String): CompletableFuture<Void?> =
        resetDraft(objectId, PostResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PostResetDraftParams = PostResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PostResetDraftParams = PostResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: PostResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: PostResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

    /** Schedule a blog post to be published at a specified time. */
    fun schedule(params: PostScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: PostScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            PostScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    /**
     * Partially updates the draft version of a single blog post by ID. You only need to specify the
     * values that you want to update.
     */
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
    ): CompletableFuture<HttpResponse> = updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: PostUpdateDraftParams): CompletableFuture<HttpResponse> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** A view of [PostServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse

        fun revisions(): RevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts`, but is otherwise the
         * same as [PostServiceAsync.create].
         */
        fun create(params: PostCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            blogPost: BlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

        /** @see create */
        fun create(blogPost: BlogPost): CompletableFuture<HttpResponse> =
            create(blogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostServiceAsync.update].
         */
        fun update(objectId: String, params: PostUpdateParams): CompletableFuture<HttpResponse> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: PostUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor`, but is otherwise
         * the same as [PostServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(PostListParams.none())

        /** @see list */
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: PostListParams = PostListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, PostDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PostDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, PostDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/clone`, but is otherwise
         * the same as [PostServiceAsync.clone].
         */
        fun clone(params: PostCloneParams): CompletableFuture<HttpResponse> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            clone(
                PostCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext
        ): CompletableFuture<HttpResponse> = clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponse> =
            get(objectId, PostGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: PostGetParams = PostGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: PostGetParams = PostGetParams.none(),
        ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PostGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: PostGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(objectId, PostGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostServiceAsync.getDraftById].
         */
        fun getDraftById(objectId: String): CompletableFuture<HttpResponse> =
            getDraftById(objectId, PostGetDraftByIdParams.none())

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        ): CompletableFuture<HttpResponse> = getDraftById(objectId, params, RequestOptions.none())

        /** @see getDraftById */
        fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getDraftById */
        fun getDraftById(params: PostGetDraftByIdParams): CompletableFuture<HttpResponse> =
            getDraftById(params, RequestOptions.none())

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor`, but is otherwise
         * the same as [PostServiceAsync.listAuthors].
         */
        fun listAuthors(): CompletableFuture<HttpResponse> =
            listAuthors(PostListAuthorsParams.none())

        /** @see listAuthors */
        fun listAuthors(
            params: PostListAuthorsParams = PostListAuthorsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listAuthors */
        fun listAuthors(
            params: PostListAuthorsParams = PostListAuthorsParams.none()
        ): CompletableFuture<HttpResponse> = listAuthors(params, RequestOptions.none())

        /** @see listAuthors */
        fun listAuthors(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listAuthors(PostListAuthorsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor`, but is otherwise
         * the same as [PostServiceAsync.listTags].
         */
        fun listTags(): CompletableFuture<HttpResponse> = listTags(PostListTagsParams.none())

        /** @see listTags */
        fun listTags(
            params: PostListTagsParams = PostListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listTags */
        fun listTags(
            params: PostListTagsParams = PostListTagsParams.none()
        ): CompletableFuture<HttpResponse> = listTags(params, RequestOptions.none())

        /** @see listTags */
        fun listTags(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listTags(PostListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/draft/push-live`, but is otherwise the same as
         * [PostServiceAsync.pushLive].
         */
        fun pushLive(objectId: String): CompletableFuture<HttpResponse> =
            pushLive(objectId, PostPushLiveParams.none())

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
        ): CompletableFuture<HttpResponse> = pushLive(objectId, params, RequestOptions.none())

        /** @see pushLive */
        fun pushLive(
            params: PostPushLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see pushLive */
        fun pushLive(params: PostPushLiveParams): CompletableFuture<HttpResponse> =
            pushLive(params, RequestOptions.none())

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            pushLive(objectId, PostPushLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor/query`, but is
         * otherwise the same as [PostServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponse> = query(PostQueryParams.none())

        /** @see query */
        fun query(
            params: PostQueryParams = PostQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see query */
        fun query(
            params: PostQueryParams = PostQueryParams.none()
        ): CompletableFuture<HttpResponse> = query(params, RequestOptions.none())

        /** @see query */
        fun query(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            query(PostQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor/query`, but is
         * otherwise the same as [PostServiceAsync.queryAuthors].
         */
        fun queryAuthors(): CompletableFuture<HttpResponse> =
            queryAuthors(PostQueryAuthorsParams.none())

        /** @see queryAuthors */
        fun queryAuthors(
            params: PostQueryAuthorsParams = PostQueryAuthorsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see queryAuthors */
        fun queryAuthors(
            params: PostQueryAuthorsParams = PostQueryAuthorsParams.none()
        ): CompletableFuture<HttpResponse> = queryAuthors(params, RequestOptions.none())

        /** @see queryAuthors */
        fun queryAuthors(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            queryAuthors(PostQueryAuthorsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor/query`, but is
         * otherwise the same as [PostServiceAsync.queryTags].
         */
        fun queryTags(): CompletableFuture<HttpResponse> = queryTags(PostQueryTagsParams.none())

        /** @see queryTags */
        fun queryTags(
            params: PostQueryTagsParams = PostQueryTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see queryTags */
        fun queryTags(
            params: PostQueryTagsParams = PostQueryTagsParams.none()
        ): CompletableFuture<HttpResponse> = queryTags(params, RequestOptions.none())

        /** @see queryTags */
        fun queryTags(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            queryTags(PostQueryTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/{objectId}/draft/reset`,
         * but is otherwise the same as [PostServiceAsync.resetDraft].
         */
        fun resetDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetDraft(objectId, PostResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: PostResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: PostResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/schedule`, but is
         * otherwise the same as [PostServiceAsync.schedule].
         */
        fun schedule(params: PostScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: PostScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                PostScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext
        ): CompletableFuture<HttpResponse> =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
        ): CompletableFuture<HttpResponse> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(params: PostUpdateDraftParams): CompletableFuture<HttpResponse> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
