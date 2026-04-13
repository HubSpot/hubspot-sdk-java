// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs.posts

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot.models.cms.UpdateLanguagesRequestVNext
import com.hubspot.models.cms.blogs.posts.BlogPostLanguageCloneRequestVNext
import com.hubspot.models.cms.blogs.posts.multilanguage.MultiLanguageAttachToLangGroupParams
import com.hubspot.models.cms.blogs.posts.multilanguage.MultiLanguageCreateLangVariationParams
import com.hubspot.models.cms.blogs.posts.multilanguage.MultiLanguageDetachFromLangGroupParams
import com.hubspot.models.cms.blogs.posts.multilanguage.MultiLanguageSetLangPrimaryParams
import com.hubspot.models.cms.blogs.posts.multilanguage.MultiLanguageUpdateLangsParams
import java.util.function.Consumer

interface MultiLanguageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultiLanguageService

    /**
     * Attach a blog post to a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    @MustBeClosed
    fun attachToLangGroup(params: MultiLanguageAttachToLangGroupParams): HttpResponse =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        attachToLangGroup(
            MultiLanguageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): HttpResponse = attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing blog post */
    @MustBeClosed
    fun createLangVariation(params: MultiLanguageCreateLangVariationParams): HttpResponse =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        params: MultiLanguageCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        createLangVariation(
            MultiLanguageCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
    ): HttpResponse = createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Detach a blog post from a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    @MustBeClosed
    fun detachFromLangGroup(params: MultiLanguageDetachFromLangGroupParams): HttpResponse =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        detachFromLangGroup(
            MultiLanguageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): HttpResponse = detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /**
     * Set the primary language of a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content)
     * to the language of the provided post (specified as an ID in the request body)
     */
    fun setLangPrimary(params: MultiLanguageSetLangPrimaryParams) =
        setLangPrimary(params, RequestOptions.none())

    /** @see setLangPrimary */
    fun setLangPrimary(
        params: MultiLanguageSetLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setLangPrimary(
            MultiLanguageSetLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setLangPrimary */
    fun setLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /**
     * Explicitly set new languages for each post in a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    @MustBeClosed
    fun updateLangs(params: MultiLanguageUpdateLangsParams): HttpResponse =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(
        params: MultiLanguageUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        updateLangs(
            MultiLanguageUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /**
     * A view of [MultiLanguageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultiLanguageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [MultiLanguageService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: MultiLanguageAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                MultiLanguageAttachToLangGroupParams.builder()
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
         * /cms/blogs/2026-03/posts/multi-language/create-language-variation`, but is otherwise the
         * same as [MultiLanguageService.createLangVariation].
         */
        @MustBeClosed
        fun createLangVariation(params: MultiLanguageCreateLangVariationParams): HttpResponse =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            params: MultiLanguageCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createLangVariation(
                MultiLanguageCreateLangVariationParams.builder()
                    .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
        ): HttpResponse =
            createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [MultiLanguageService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: MultiLanguageDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                MultiLanguageDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `put
         * /cms/blogs/2026-03/posts/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [MultiLanguageService.setLangPrimary].
         */
        @MustBeClosed
        fun setLangPrimary(params: MultiLanguageSetLangPrimaryParams): HttpResponse =
            setLangPrimary(params, RequestOptions.none())

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            params: MultiLanguageSetLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setLangPrimary(
                MultiLanguageSetLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): HttpResponse = setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/update-languages`, but is otherwise the same as
         * [MultiLanguageService.updateLangs].
         */
        @MustBeClosed
        fun updateLangs(params: MultiLanguageUpdateLangsParams): HttpResponse =
            updateLangs(params, RequestOptions.none())

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(
            params: MultiLanguageUpdateLangsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLangs(
                MultiLanguageUpdateLangsParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
            updateLangs(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
