// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestCreateLandingPageVariationParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestEndLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestRerunLandingPageTestParams
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
    fun createLandingPageVariation(
        params: AbTestCreateLandingPageVariationParams
    ): CompletableFuture<PagesPage> = createLandingPageVariation(params, RequestOptions.none())

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        params: AbTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        createLandingPageVariation(
            AbTestCreateLandingPageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<PagesPage> =
        createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endLandingPageTest(params: AbTestEndLandingPageTestParams): CompletableFuture<Void?> =
        endLandingPageTest(params, RequestOptions.none())

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        params: AbTestEndLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endLandingPageTest(
            AbTestEndLandingPageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endLandingPageTest */
    fun endLandingPageTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunLandingPageTest(params: AbTestRerunLandingPageTestParams): CompletableFuture<Void?> =
        rerunLandingPageTest(params, RequestOptions.none())

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        params: AbTestRerunLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunLandingPageTest(
            AbTestRerunLandingPageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext
    ): CompletableFuture<Void?> =
        rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())

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
         * /cms/pages/2026-03/landing-pages/ab-test/create-variation`, but is otherwise the same as
         * [AbTestServiceAsync.createLandingPageVariation].
         */
        fun createLandingPageVariation(
            params: AbTestCreateLandingPageVariationParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            createLandingPageVariation(params, RequestOptions.none())

        /** @see createLandingPageVariation */
        fun createLandingPageVariation(
            params: AbTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see createLandingPageVariation */
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            createLandingPageVariation(
                AbTestCreateLandingPageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLandingPageVariation */
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/end`, but
         * is otherwise the same as [AbTestServiceAsync.endLandingPageTest].
         */
        fun endLandingPageTest(
            params: AbTestEndLandingPageTestParams
        ): CompletableFuture<HttpResponse> = endLandingPageTest(params, RequestOptions.none())

        /** @see endLandingPageTest */
        fun endLandingPageTest(
            params: AbTestEndLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endLandingPageTest */
        fun endLandingPageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endLandingPageTest(
                AbTestEndLandingPageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endLandingPageTest */
        fun endLandingPageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> =
            endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/rerun`,
         * but is otherwise the same as [AbTestServiceAsync.rerunLandingPageTest].
         */
        fun rerunLandingPageTest(
            params: AbTestRerunLandingPageTestParams
        ): CompletableFuture<HttpResponse> = rerunLandingPageTest(params, RequestOptions.none())

        /** @see rerunLandingPageTest */
        fun rerunLandingPageTest(
            params: AbTestRerunLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunLandingPageTest */
        fun rerunLandingPageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunLandingPageTest(
                AbTestRerunLandingPageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunLandingPageTest */
        fun rerunLandingPageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext
        ): CompletableFuture<HttpResponse> =
            rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
