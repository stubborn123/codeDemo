package com.zp.article.demo.service.impl;

import com.zp.article.demo.entity.Article;
import com.zp.article.demo.mapper.ArticleMapper;
import com.zp.article.demo.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zp
 * @since 2022-02-25
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
