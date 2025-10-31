// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListPage
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchInputBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchResponseBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthorCloneRequestVNext
import java.util.function.Consumer

interface AuthorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthorService

    /** Create a new Blog Author. */
    fun create(params: AuthorCreateParams): BlogAuthor = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor

    /** @see create */
    fun create(
        blogAuthor: BlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor =
        create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

    /** @see create */
    fun create(blogAuthor: BlogAuthor): BlogAuthor = create(blogAuthor, RequestOptions.none())

    /**
     * Sparse updates a single Blog Author object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    fun update(objectId: String, params: AuthorUpdateParams): BlogAuthor =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: AuthorUpdateParams): BlogAuthor = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor

    /**
     * Get the list of blog authors. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    fun list(): AuthorListPage = list(AuthorListParams.none())

    /** @see list */
    fun list(
        params: AuthorListParams = AuthorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorListPage

    /** @see list */
    fun list(params: AuthorListParams = AuthorListParams.none()): AuthorListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuthorListPage =
        list(AuthorListParams.none(), requestOptions)

    /** Delete the Blog Author object identified by the id in the path. */
    fun delete(objectId: String) = delete(objectId, AuthorDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: AuthorDeleteParams = AuthorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: AuthorDeleteParams = AuthorDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AuthorDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AuthorDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, AuthorDeleteParams.none(), requestOptions)

    /** Attach a Blog Author to a multi-language group. */
    fun attachToLangGroup(params: AuthorAttachToLangGroupParams) =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: AuthorAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        attachToLangGroup(
            AuthorAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create the Blog Author objects detailed in the request body. */
    fun createBatch(params: AuthorCreateBatchParams): BatchResponseBlogAuthor =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: AuthorCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogAuthor

    /** @see createBatch */
    fun createBatch(
        batchInputBlogAuthor: BatchInputBlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogAuthor =
        createBatch(
            AuthorCreateBatchParams.builder().batchInputBlogAuthor(batchInputBlogAuthor).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputBlogAuthor: BatchInputBlogAuthor): BatchResponseBlogAuthor =
        createBatch(batchInputBlogAuthor, RequestOptions.none())

    /** Create a new language variation from an existing Blog Author. */
    fun createLanguageVariation(params: AuthorCreateLanguageVariationParams): BlogAuthor =
        createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor =
        createLanguageVariation(
            AuthorCreateLanguageVariationParams.builder()
                .blogAuthorCloneRequestVNext(blogAuthorCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext
    ): BlogAuthor = createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

    /** Delete the Blog Author objects identified in the request body. */
    fun deleteBatch(params: AuthorDeleteBatchParams) = deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: AuthorDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteBatch(
            AuthorDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString) =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Detach a Blog Author from a multi-language group. */
    fun detachFromLangGroup(params: AuthorDetachFromLangGroupParams) =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: AuthorDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        detachFromLangGroup(
            AuthorDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext) =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Author object identified by the id in the path. */
    fun get(objectId: String): BlogAuthor = get(objectId, AuthorGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: AuthorGetParams = AuthorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: AuthorGetParams = AuthorGetParams.none()): BlogAuthor =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AuthorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogAuthor

    /** @see get */
    fun get(params: AuthorGetParams): BlogAuthor = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): BlogAuthor =
        get(objectId, AuthorGetParams.none(), requestOptions)

    /** Retrieve the Blog Author objects identified in the request body. */
    fun getBatch(params: AuthorGetBatchParams): BatchResponseBlogAuthor =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: AuthorGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogAuthor

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogAuthor =
        getBatch(
            AuthorGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): BatchResponseBlogAuthor =
        getBatch(batchInputString, RequestOptions.none())

    /** Set a Blog Author as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: AuthorSetNewLangPrimaryParams) =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: AuthorSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setNewLangPrimary(
            AuthorSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Update the Blog Author objects identified in the request body. */
    fun updateBatch(params: AuthorUpdateBatchParams): BatchResponseBlogAuthor =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: AuthorUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogAuthor

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogAuthor =
        updateBatch(
            AuthorUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): BatchResponseBlogAuthor =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /** Explicitly set new languages for each Blog Author in a multi-language group. */
    fun updateLanguages(params: AuthorUpdateLanguagesParams) =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: AuthorUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateLanguages(
            AuthorUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [AuthorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors`, but is otherwise the same
         * as [AuthorService.create].
         */
        @MustBeClosed
        fun create(params: AuthorCreateParams): HttpResponseFor<BlogAuthor> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AuthorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor>

        /** @see create */
        @MustBeClosed
        fun create(
            blogAuthor: BlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor> =
            create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(blogAuthor: BlogAuthor): HttpResponseFor<BlogAuthor> =
            create(blogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/blogs/authors/{objectId}`, but is
         * otherwise the same as [AuthorService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: AuthorUpdateParams): HttpResponseFor<BlogAuthor> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AuthorUpdateParams): HttpResponseFor<BlogAuthor> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/authors`, but is otherwise the same as
         * [AuthorService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AuthorListPage> = list(AuthorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthorListParams = AuthorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthorListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthorListParams = AuthorListParams.none()
        ): HttpResponseFor<AuthorListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuthorListPage> =
            list(AuthorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/blogs/authors/{objectId}`, but is
         * otherwise the same as [AuthorService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, AuthorDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: AuthorDeleteParams = AuthorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: AuthorDeleteParams = AuthorDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AuthorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AuthorDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, AuthorDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/attach-to-lang-group`, but is otherwise the same as
         * [AuthorService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: AuthorAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: AuthorAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                AuthorAttachToLangGroupParams.builder()
                    .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
        ): HttpResponse = attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/create`, but is
         * otherwise the same as [AuthorService.createBatch].
         */
        @MustBeClosed
        fun createBatch(params: AuthorCreateBatchParams): HttpResponseFor<BatchResponseBlogAuthor> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: AuthorCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogAuthor>

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputBlogAuthor: BatchInputBlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogAuthor> =
            createBatch(
                AuthorCreateBatchParams.builder()
                    .batchInputBlogAuthor(batchInputBlogAuthor)
                    .build(),
                requestOptions,
            )

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputBlogAuthor: BatchInputBlogAuthor
        ): HttpResponseFor<BatchResponseBlogAuthor> =
            createBatch(batchInputBlogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/create-language-variation`, but is otherwise the
         * same as [AuthorService.createLanguageVariation].
         */
        @MustBeClosed
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams
        ): HttpResponseFor<BlogAuthor> = createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor>

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor> =
            createLanguageVariation(
                AuthorCreateLanguageVariationParams.builder()
                    .blogAuthorCloneRequestVNext(blogAuthorCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext
        ): HttpResponseFor<BlogAuthor> =
            createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/archive`, but is
         * otherwise the same as [AuthorService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: AuthorDeleteBatchParams): HttpResponse =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: AuthorDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteBatch(
                AuthorDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(batchInputString: BatchInputString): HttpResponse =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/detach-from-lang-group`, but is otherwise the same
         * as [AuthorService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: AuthorDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: AuthorDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                AuthorDetachFromLangGroupParams.builder()
                    .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
        ): HttpResponse =
            detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/authors/{objectId}`, but is otherwise
         * the same as [AuthorService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<BlogAuthor> =
            get(objectId, AuthorGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
        ): HttpResponseFor<BlogAuthor> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AuthorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogAuthor>

        /** @see get */
        @MustBeClosed
        fun get(params: AuthorGetParams): HttpResponseFor<BlogAuthor> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<BlogAuthor> =
            get(objectId, AuthorGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/read`, but is otherwise
         * the same as [AuthorService.getBatch].
         */
        @MustBeClosed
        fun getBatch(params: AuthorGetBatchParams): HttpResponseFor<BatchResponseBlogAuthor> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: AuthorGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogAuthor>

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogAuthor> =
            getBatch(
                AuthorGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(batchInputString: BatchInputString): HttpResponseFor<BatchResponseBlogAuthor> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/blogs/authors/multi-language/set-new-lang-primary`, but is otherwise the same as
         * [AuthorService.setNewLangPrimary].
         */
        @MustBeClosed
        fun setNewLangPrimary(params: AuthorSetNewLangPrimaryParams): HttpResponse =
            setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            params: AuthorSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setNewLangPrimary(
                AuthorSetNewLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): HttpResponse =
            setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/update`, but is
         * otherwise the same as [AuthorService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: AuthorUpdateBatchParams): HttpResponseFor<BatchResponseBlogAuthor> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: AuthorUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogAuthor>

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogAuthor> =
            updateBatch(
                AuthorUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponseBlogAuthor> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/update-languages`, but is otherwise the same as
         * [AuthorService.updateLanguages].
         */
        @MustBeClosed
        fun updateLanguages(params: AuthorUpdateLanguagesParams): HttpResponse =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            params: AuthorUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLanguages(
                AuthorUpdateLanguagesParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): HttpResponse = updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
