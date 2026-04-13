// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot.models.cms.UpdateLanguagesRequestVNext
import com.hubspot.models.cms.blogs.authors.AuthorAttachToLangGroupParams
import com.hubspot.models.cms.blogs.authors.AuthorCreateLanguageVariationParams
import com.hubspot.models.cms.blogs.authors.AuthorCreateParams
import com.hubspot.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot.models.cms.blogs.authors.AuthorDetachFromLangGroupParams
import com.hubspot.models.cms.blogs.authors.AuthorGetCursorByQueryParams
import com.hubspot.models.cms.blogs.authors.AuthorGetCursorParams
import com.hubspot.models.cms.blogs.authors.AuthorGetParams
import com.hubspot.models.cms.blogs.authors.AuthorGetPostsCursorByQueryParams
import com.hubspot.models.cms.blogs.authors.AuthorGetPostsCursorParams
import com.hubspot.models.cms.blogs.authors.AuthorGetTagsCursorByQueryParams
import com.hubspot.models.cms.blogs.authors.AuthorGetTagsCursorParams
import com.hubspot.models.cms.blogs.authors.AuthorListParams
import com.hubspot.models.cms.blogs.authors.AuthorSetNewLangPrimaryParams
import com.hubspot.models.cms.blogs.authors.AuthorUpdateLanguagesParams
import com.hubspot.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot.models.cms.blogs.authors.BlogAuthor
import com.hubspot.models.cms.blogs.authors.BlogAuthorCloneRequestVNext
import com.hubspot.services.blocking.cms.blogs.authors.BatchService
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

    fun batch(): BatchService

    /** Create a new Blog Author. */
    @MustBeClosed
    fun create(params: AuthorCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: AuthorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(
        blogAuthor: BlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

    /** @see create */
    @MustBeClosed
    fun create(blogAuthor: BlogAuthor): HttpResponse = create(blogAuthor, RequestOptions.none())

    /**
     * Sparse updates a single Blog Author object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    @MustBeClosed
    fun update(objectId: String, params: AuthorUpdateParams): HttpResponse =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        objectId: String,
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    @MustBeClosed
    fun update(params: AuthorUpdateParams): HttpResponse = update(params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Get the list of blog authors. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    @MustBeClosed fun list(): HttpResponse = list(AuthorListParams.none())

    /** @see list */
    @MustBeClosed
    fun list(
        params: AuthorListParams = AuthorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see list */
    @MustBeClosed
    fun list(params: AuthorListParams = AuthorListParams.none()): HttpResponse =
        list(params, RequestOptions.none())

    /** @see list */
    @MustBeClosed
    fun list(requestOptions: RequestOptions): HttpResponse =
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

    /** Create a new language variation from an existing Blog Author. */
    @MustBeClosed
    fun createLanguageVariation(params: AuthorCreateLanguageVariationParams): HttpResponse =
        createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    @MustBeClosed
    fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createLanguageVariation */
    @MustBeClosed
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
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
    ): HttpResponse = createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

    /** Detach a Blog Author from a multi-language group. */
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
    ): HttpResponse = detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Author object identified by the id in the path. */
    @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, AuthorGetParams.none())

    /** @see get */
    @MustBeClosed
    fun get(
        objectId: String,
        params: AuthorGetParams = AuthorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, params: AuthorGetParams = AuthorGetParams.none()): HttpResponse =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: AuthorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed
    fun get(params: AuthorGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
        get(objectId, AuthorGetParams.none(), requestOptions)

    @MustBeClosed fun getCursor(): HttpResponse = getCursor(AuthorGetCursorParams.none())

    /** @see getCursor */
    @MustBeClosed
    fun getCursor(
        params: AuthorGetCursorParams = AuthorGetCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getCursor */
    @MustBeClosed
    fun getCursor(params: AuthorGetCursorParams = AuthorGetCursorParams.none()): HttpResponse =
        getCursor(params, RequestOptions.none())

    /** @see getCursor */
    @MustBeClosed
    fun getCursor(requestOptions: RequestOptions): HttpResponse =
        getCursor(AuthorGetCursorParams.none(), requestOptions)

    @MustBeClosed
    fun getCursorByQuery(): HttpResponse = getCursorByQuery(AuthorGetCursorByQueryParams.none())

    /** @see getCursorByQuery */
    @MustBeClosed
    fun getCursorByQuery(
        params: AuthorGetCursorByQueryParams = AuthorGetCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getCursorByQuery */
    @MustBeClosed
    fun getCursorByQuery(
        params: AuthorGetCursorByQueryParams = AuthorGetCursorByQueryParams.none()
    ): HttpResponse = getCursorByQuery(params, RequestOptions.none())

    /** @see getCursorByQuery */
    @MustBeClosed
    fun getCursorByQuery(requestOptions: RequestOptions): HttpResponse =
        getCursorByQuery(AuthorGetCursorByQueryParams.none(), requestOptions)

    @MustBeClosed
    fun getPostsCursor(): HttpResponse = getPostsCursor(AuthorGetPostsCursorParams.none())

    /** @see getPostsCursor */
    @MustBeClosed
    fun getPostsCursor(
        params: AuthorGetPostsCursorParams = AuthorGetPostsCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getPostsCursor */
    @MustBeClosed
    fun getPostsCursor(
        params: AuthorGetPostsCursorParams = AuthorGetPostsCursorParams.none()
    ): HttpResponse = getPostsCursor(params, RequestOptions.none())

    /** @see getPostsCursor */
    @MustBeClosed
    fun getPostsCursor(requestOptions: RequestOptions): HttpResponse =
        getPostsCursor(AuthorGetPostsCursorParams.none(), requestOptions)

    @MustBeClosed
    fun getPostsCursorByQuery(): HttpResponse =
        getPostsCursorByQuery(AuthorGetPostsCursorByQueryParams.none())

    /** @see getPostsCursorByQuery */
    @MustBeClosed
    fun getPostsCursorByQuery(
        params: AuthorGetPostsCursorByQueryParams = AuthorGetPostsCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getPostsCursorByQuery */
    @MustBeClosed
    fun getPostsCursorByQuery(
        params: AuthorGetPostsCursorByQueryParams = AuthorGetPostsCursorByQueryParams.none()
    ): HttpResponse = getPostsCursorByQuery(params, RequestOptions.none())

    /** @see getPostsCursorByQuery */
    @MustBeClosed
    fun getPostsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
        getPostsCursorByQuery(AuthorGetPostsCursorByQueryParams.none(), requestOptions)

    @MustBeClosed
    fun getTagsCursor(): HttpResponse = getTagsCursor(AuthorGetTagsCursorParams.none())

    /** @see getTagsCursor */
    @MustBeClosed
    fun getTagsCursor(
        params: AuthorGetTagsCursorParams = AuthorGetTagsCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getTagsCursor */
    @MustBeClosed
    fun getTagsCursor(
        params: AuthorGetTagsCursorParams = AuthorGetTagsCursorParams.none()
    ): HttpResponse = getTagsCursor(params, RequestOptions.none())

    /** @see getTagsCursor */
    @MustBeClosed
    fun getTagsCursor(requestOptions: RequestOptions): HttpResponse =
        getTagsCursor(AuthorGetTagsCursorParams.none(), requestOptions)

    @MustBeClosed
    fun getTagsCursorByQuery(): HttpResponse =
        getTagsCursorByQuery(AuthorGetTagsCursorByQueryParams.none())

    /** @see getTagsCursorByQuery */
    @MustBeClosed
    fun getTagsCursorByQuery(
        params: AuthorGetTagsCursorByQueryParams = AuthorGetTagsCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getTagsCursorByQuery */
    @MustBeClosed
    fun getTagsCursorByQuery(
        params: AuthorGetTagsCursorByQueryParams = AuthorGetTagsCursorByQueryParams.none()
    ): HttpResponse = getTagsCursorByQuery(params, RequestOptions.none())

    /** @see getTagsCursorByQuery */
    @MustBeClosed
    fun getTagsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
        getTagsCursorByQuery(AuthorGetTagsCursorByQueryParams.none(), requestOptions)

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

    /** Explicitly set new languages for each Blog Author in a multi-language group. */
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
    fun updateLanguages(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [AuthorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthorService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/authors`, but is otherwise the
         * same as [AuthorService.create].
         */
        @MustBeClosed
        fun create(params: AuthorCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AuthorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            blogAuthor: BlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(blogAuthor: BlogAuthor): HttpResponse = create(blogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/authors/{objectId}`, but is
         * otherwise the same as [AuthorService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: AuthorUpdateParams): HttpResponse =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AuthorUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors`, but is otherwise the
         * same as [AuthorService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(AuthorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthorListParams = AuthorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: AuthorListParams = AuthorListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(AuthorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/authors/{objectId}`, but is
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
         * /cms/blogs/2026-03/authors/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [AuthorService.attachToLangGroup].
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
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/authors/multi-language/create-language-variation`, but is otherwise
         * the same as [AuthorService.createLanguageVariation].
         */
        @MustBeClosed
        fun createLanguageVariation(params: AuthorCreateLanguageVariationParams): HttpResponse =
            createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
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
        ): HttpResponse =
            createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/authors/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [AuthorService.detachFromLangGroup].
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
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/{objectId}`, but is
         * otherwise the same as [AuthorService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponse = get(objectId, AuthorGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, params: AuthorGetParams = AuthorGetParams.none()): HttpResponse =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AuthorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: AuthorGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
            get(objectId, AuthorGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor`, but is otherwise
         * the same as [AuthorService.getCursor].
         */
        @MustBeClosed fun getCursor(): HttpResponse = getCursor(AuthorGetCursorParams.none())

        /** @see getCursor */
        @MustBeClosed
        fun getCursor(
            params: AuthorGetCursorParams = AuthorGetCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getCursor */
        @MustBeClosed
        fun getCursor(params: AuthorGetCursorParams = AuthorGetCursorParams.none()): HttpResponse =
            getCursor(params, RequestOptions.none())

        /** @see getCursor */
        @MustBeClosed
        fun getCursor(requestOptions: RequestOptions): HttpResponse =
            getCursor(AuthorGetCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor/query`, but is
         * otherwise the same as [AuthorService.getCursorByQuery].
         */
        @MustBeClosed
        fun getCursorByQuery(): HttpResponse = getCursorByQuery(AuthorGetCursorByQueryParams.none())

        /** @see getCursorByQuery */
        @MustBeClosed
        fun getCursorByQuery(
            params: AuthorGetCursorByQueryParams = AuthorGetCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getCursorByQuery */
        @MustBeClosed
        fun getCursorByQuery(
            params: AuthorGetCursorByQueryParams = AuthorGetCursorByQueryParams.none()
        ): HttpResponse = getCursorByQuery(params, RequestOptions.none())

        /** @see getCursorByQuery */
        @MustBeClosed
        fun getCursorByQuery(requestOptions: RequestOptions): HttpResponse =
            getCursorByQuery(AuthorGetCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor`, but is otherwise
         * the same as [AuthorService.getPostsCursor].
         */
        @MustBeClosed
        fun getPostsCursor(): HttpResponse = getPostsCursor(AuthorGetPostsCursorParams.none())

        /** @see getPostsCursor */
        @MustBeClosed
        fun getPostsCursor(
            params: AuthorGetPostsCursorParams = AuthorGetPostsCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getPostsCursor */
        @MustBeClosed
        fun getPostsCursor(
            params: AuthorGetPostsCursorParams = AuthorGetPostsCursorParams.none()
        ): HttpResponse = getPostsCursor(params, RequestOptions.none())

        /** @see getPostsCursor */
        @MustBeClosed
        fun getPostsCursor(requestOptions: RequestOptions): HttpResponse =
            getPostsCursor(AuthorGetPostsCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor/query`, but is
         * otherwise the same as [AuthorService.getPostsCursorByQuery].
         */
        @MustBeClosed
        fun getPostsCursorByQuery(): HttpResponse =
            getPostsCursorByQuery(AuthorGetPostsCursorByQueryParams.none())

        /** @see getPostsCursorByQuery */
        @MustBeClosed
        fun getPostsCursorByQuery(
            params: AuthorGetPostsCursorByQueryParams = AuthorGetPostsCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getPostsCursorByQuery */
        @MustBeClosed
        fun getPostsCursorByQuery(
            params: AuthorGetPostsCursorByQueryParams = AuthorGetPostsCursorByQueryParams.none()
        ): HttpResponse = getPostsCursorByQuery(params, RequestOptions.none())

        /** @see getPostsCursorByQuery */
        @MustBeClosed
        fun getPostsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
            getPostsCursorByQuery(AuthorGetPostsCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor`, but is otherwise
         * the same as [AuthorService.getTagsCursor].
         */
        @MustBeClosed
        fun getTagsCursor(): HttpResponse = getTagsCursor(AuthorGetTagsCursorParams.none())

        /** @see getTagsCursor */
        @MustBeClosed
        fun getTagsCursor(
            params: AuthorGetTagsCursorParams = AuthorGetTagsCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getTagsCursor */
        @MustBeClosed
        fun getTagsCursor(
            params: AuthorGetTagsCursorParams = AuthorGetTagsCursorParams.none()
        ): HttpResponse = getTagsCursor(params, RequestOptions.none())

        /** @see getTagsCursor */
        @MustBeClosed
        fun getTagsCursor(requestOptions: RequestOptions): HttpResponse =
            getTagsCursor(AuthorGetTagsCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor/query`, but is
         * otherwise the same as [AuthorService.getTagsCursorByQuery].
         */
        @MustBeClosed
        fun getTagsCursorByQuery(): HttpResponse =
            getTagsCursorByQuery(AuthorGetTagsCursorByQueryParams.none())

        /** @see getTagsCursorByQuery */
        @MustBeClosed
        fun getTagsCursorByQuery(
            params: AuthorGetTagsCursorByQueryParams = AuthorGetTagsCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getTagsCursorByQuery */
        @MustBeClosed
        fun getTagsCursorByQuery(
            params: AuthorGetTagsCursorByQueryParams = AuthorGetTagsCursorByQueryParams.none()
        ): HttpResponse = getTagsCursorByQuery(params, RequestOptions.none())

        /** @see getTagsCursorByQuery */
        @MustBeClosed
        fun getTagsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
            getTagsCursorByQuery(AuthorGetTagsCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/blogs/2026-03/authors/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [AuthorService.setNewLangPrimary].
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
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/authors/multi-language/update-languages`, but is otherwise the same as
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
