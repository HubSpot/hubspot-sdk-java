// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestCreateSitePageVariationParams
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestEndSitePageTestParams
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestRerunSitePageTestParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AbTestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestServiceAsync

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createSitePageVariation(
        params: AbTestCreateSitePageVariationParams
    ): CompletableFuture<PagesPage> = createSitePageVariation(params, RequestOptions.none())

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        params: AbTestCreateSitePageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        createSitePageVariation(
            AbTestCreateSitePageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<PagesPage> =
        createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endSitePageTest(params: AbTestEndSitePageTestParams): CompletableFuture<Void?> =
        endSitePageTest(params, RequestOptions.none())

    /** @see endSitePageTest */
    fun endSitePageTest(
        params: AbTestEndSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endSitePageTest */
    fun endSitePageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endSitePageTest(
            AbTestEndSitePageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endSitePageTest */
    fun endSitePageTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunSitePageTest(params: AbTestRerunSitePageTestParams): CompletableFuture<Void?> =
        rerunSitePageTest(params, RequestOptions.none())

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        params: AbTestRerunSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunSitePageTest(
            AbTestRerunSitePageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext
    ): CompletableFuture<Void?> = rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())

    /**
     * A view of [AbTestServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AbTestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/ab-test/create-variation`, but is otherwise the same as
         * [AbTestServiceAsync.createSitePageVariation].
         */
        fun createSitePageVariation(
            params: AbTestCreateSitePageVariationParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            createSitePageVariation(params, RequestOptions.none())

        /** @see createSitePageVariation */
        fun createSitePageVariation(
            params: AbTestCreateSitePageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see createSitePageVariation */
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            createSitePageVariation(
                AbTestCreateSitePageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createSitePageVariation */
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/end`, but is
         * otherwise the same as [AbTestServiceAsync.endSitePageTest].
         */
        fun endSitePageTest(params: AbTestEndSitePageTestParams): CompletableFuture<HttpResponse> =
            endSitePageTest(params, RequestOptions.none())

        /** @see endSitePageTest */
        fun endSitePageTest(
            params: AbTestEndSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endSitePageTest */
        fun endSitePageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endSitePageTest(
                AbTestEndSitePageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endSitePageTest */
        fun endSitePageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> =
            endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/rerun`, but
         * is otherwise the same as [AbTestServiceAsync.rerunSitePageTest].
         */
        fun rerunSitePageTest(
            params: AbTestRerunSitePageTestParams
        ): CompletableFuture<HttpResponse> = rerunSitePageTest(params, RequestOptions.none())

        /** @see rerunSitePageTest */
        fun rerunSitePageTest(
            params: AbTestRerunSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunSitePageTest */
        fun rerunSitePageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunSitePageTest(
                AbTestRerunSitePageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunSitePageTest */
        fun rerunSitePageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext
        ): CompletableFuture<HttpResponse> =
            rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
