// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.blogs.posts

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot.sdk.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot.sdk.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot.sdk.models.cms.UpdateLanguagesRequestVNext
import com.hubspot.sdk.models.cms.blogs.posts.BlogPostLanguageCloneRequestVNext
import com.hubspot.sdk.models.cms.blogs.posts.multilanguage.MultiLanguageAttachToLangGroupParams
import com.hubspot.sdk.models.cms.blogs.posts.multilanguage.MultiLanguageCreateLangVariationParams
import com.hubspot.sdk.models.cms.blogs.posts.multilanguage.MultiLanguageDetachFromLangGroupParams
import com.hubspot.sdk.models.cms.blogs.posts.multilanguage.MultiLanguageSetLangPrimaryParams
import com.hubspot.sdk.models.cms.blogs.posts.multilanguage.MultiLanguageUpdateLangsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MultiLanguageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultiLanguageServiceAsync

    /**
     * Attach a blog post to a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams
    ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(
            MultiLanguageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing blog post */
    fun createLangVariation(
        params: MultiLanguageCreateLangVariationParams
    ): CompletableFuture<HttpResponse> = createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: MultiLanguageCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        createLangVariation(
            MultiLanguageCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
    ): CompletableFuture<HttpResponse> =
        createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Detach a blog post from a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams
    ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(
            MultiLanguageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /**
     * Set the primary language of a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content)
     * to the language of the provided post (specified as an ID in the request body)
     */
    fun setLangPrimary(params: MultiLanguageSetLangPrimaryParams): CompletableFuture<Void?> =
        setLangPrimary(params, RequestOptions.none())

    /** @see setLangPrimary */
    fun setLangPrimary(
        params: MultiLanguageSetLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setLangPrimary(
            MultiLanguageSetLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /**
     * Explicitly set new languages for each post in a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun updateLangs(params: MultiLanguageUpdateLangsParams): CompletableFuture<HttpResponse> =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: MultiLanguageUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateLangs(
            MultiLanguageUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<HttpResponse> =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /**
     * A view of [MultiLanguageServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultiLanguageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [MultiLanguageServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                MultiLanguageAttachToLangGroupParams.builder()
                    .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/create-language-variation`, but is otherwise the
         * same as [MultiLanguageServiceAsync.createLangVariation].
         */
        fun createLangVariation(
            params: MultiLanguageCreateLangVariationParams
        ): CompletableFuture<HttpResponse> = createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        fun createLangVariation(
            params: MultiLanguageCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createLangVariation */
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createLangVariation(
                MultiLanguageCreateLangVariationParams.builder()
                    .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
        ): CompletableFuture<HttpResponse> =
            createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [MultiLanguageServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                MultiLanguageDetachFromLangGroupParams.builder()
                    .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/blogs/2026-03/posts/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [MultiLanguageServiceAsync.setLangPrimary].
         */
        fun setLangPrimary(
            params: MultiLanguageSetLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setLangPrimary(params, RequestOptions.none())

        /** @see setLangPrimary */
        fun setLangPrimary(
            params: MultiLanguageSetLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setLangPrimary */
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setLangPrimary(
                MultiLanguageSetLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setLangPrimary */
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): CompletableFuture<HttpResponse> =
            setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/update-languages`, but is otherwise the same as
         * [MultiLanguageServiceAsync.updateLangs].
         */
        fun updateLangs(params: MultiLanguageUpdateLangsParams): CompletableFuture<HttpResponse> =
            updateLangs(params, RequestOptions.none())

        /** @see updateLangs */
        fun updateLangs(
            params: MultiLanguageUpdateLangsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLangs */
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLangs(
                MultiLanguageUpdateLangsParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLangs */
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): CompletableFuture<HttpResponse> =
            updateLangs(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
