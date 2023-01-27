export interface Post {
  id: number,
  body: string,
  title: string,
  active: boolean,
  type: 'news' | 'politic' | 'education'
  author: string
}
